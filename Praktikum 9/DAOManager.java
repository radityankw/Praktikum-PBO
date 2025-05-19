/* File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */
public class DAOManager {
    private PersonDAO personDAO;
    
    public  void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }
    
    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
