import javax.persistence.*;

@Embeddable
public class Name {

	private String lname;
	private String fname;
	private String mname;
	private String suffix;
	private String title;

    public Name() { }

    public Name(String lname, String fname, String mname, String suffix, String title) {
        this.lname = lname;
        this.fname = fname;
        this.mname = mname;
        this.suffix = suffix;
        this.title = title;
    }

    @Column(name = "last_name")
    public String getLname() { return lname; }
    public void setLname(String l) { lname = l; }

    @Column(name = "first_name")
    public String getFname() { return fname; }
    public void setFname(String f) { fname = f; }

    @Column(name = "middle_name")
	public String getMname() { return mname; }
    public void setMname(String m) { mname = m; }

    @Column(name = "suffix")
    public String getSuffix() { return suffix; }
    public void setSuffix(String s) { suffix = s; }

    @Column(name = "title")
    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }    


}