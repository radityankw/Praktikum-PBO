/* File : MainDAO.java
 * Deskripsi : main program untuk akses DAO 
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
