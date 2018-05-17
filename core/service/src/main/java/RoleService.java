import java.util.*;

public class RoleService {
    private static RoleDao roleDao;

    public RoleService() {
        roleDao = new RoleDao();
    }

    public Set<Roles> findAll() {
        List<Roles> roleList = roleDao.findAll();
        Set<Roles> roles = new HashSet<Roles>(roleList); 
        return roles;
    }

    public Roles findById(long id) {
        Roles role = roleDao.findById(id);
        return role;
    }

    public void addRole(String stringRole) {
        Roles newRole = new Roles();
        newRole.setRole(stringRole);
        roleDao.addRole(newRole);
    }

    public void updateRole(long id, String urole) {
        Roles r = findById(id);
        r.setRole(urole);
        roleDao.roleUpdate(r);
    }

    public void deleteRole(long id) {
        roleDao.deleteRole(id);
    }
}