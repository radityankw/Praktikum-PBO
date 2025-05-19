/* File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MySQL
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */
public class MySQLPersonDAO implements  PersonDAO{
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo", "root", "Kusuma123*45");
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);
        java.sql.Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}
