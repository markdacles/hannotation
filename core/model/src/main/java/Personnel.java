import java.time.*;
import java.util.Set;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "personnel")
public class Personnel {
 

    private long id;
    private Name name;
    private Address address;
    private Date birthday;
    private double gwa;
    private Date dateHired;
    private Set<Contact> contact  = new HashSet<Contact>();
    private Set<Roles> roles  = new HashSet<Roles>();

    public Personnel() { }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    @Embedded
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    @Embedded
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    @Column(name = "birthday")
    public Date getBirthday() { return birthday; }
    public void setBirthday(Date birthday) { this.birthday = birthday; }    

    @Column(name = "gwa")
    public double getGwa() { return gwa; }
    public void setGwa(double gwa) { this.gwa = gwa; }

    @Column(name = "date_hired")
    public Date getDateHired() { return dateHired; }
    public void setDateHired(Date dateHired) { this.dateHired = dateHired; }  

    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.ALL})
    @JoinTable(name = "personnel_contact", 
        joinColumns = {@JoinColumn(name="id")}, 
        inverseJoinColumns = {@JoinColumn(name = "contact_id")})
    public Set<Contact> getContact() { return contact; }
    public void setContact(Set<Contact> contact) { this.contact = contact; }

    @ManyToMany(fetch = FetchType.EAGER)
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinTable(name = "personnel_roles", 
        joinColumns = {@JoinColumn(name="id")}, 
        inverseJoinColumns = {@JoinColumn(name = "role_id")})
    public Set<Roles> getRoles() { return roles; }
    public void setRoles(Set rroles) { roles = rroles; }

}