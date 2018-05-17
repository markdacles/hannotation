import java.util.Set;

public class ContactService {
    private static PersonnelDao personnelDao;

    public ContactService() {
        personnelDao = new PersonnelDao();
    }

    public Contact findById(long id) {
        Contact contact = personnelDao.findContactById(id);
        return contact;
    }

    public void addContactToPersonnel(Contact c, long id) {
        Personnel p = personnelDao.getPersonnel(id);
        p.getContact().add(c);
        personnelDao.addContactToPersonnel(p);
    }

    public void updateContact(Contact c) {
        personnelDao.contactUpdate(c);
    }

    public void removeContact(long id, Contact c) {
        Personnel p = personnelDao.getPersonnel(id);
        p.getContact().remove(c);
        personnelDao.removeContact(p);
    }
}