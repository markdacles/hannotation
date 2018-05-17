import javax.persistence.*;

@Embeddable
public class Address {

	private String stNum;
	private String brgy;
	private String city;
	private String zipCode;

    public Address() { }

    public Address(String stNum, String brgy, String city, String zipCode) {
        this.stNum = stNum;
        this.brgy = brgy;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Column(name = "st_number")
    public String getStNum() { return stNum; }
    public void setStNum(String s) { stNum = s; }  

    @Column(name = "barangay")
    public String getBrgy() { return brgy; }
    public void setBrgy(String b) { brgy = b; }  

    @Column(name = "city")
    public String getCity() { return city; }
    public void setCity(String c) { city = c; }   

    @Column(name = "zip_code")
    public String getZipCode() { return zipCode; }
    public void setZipCode(String z) { zipCode = z; } 
}