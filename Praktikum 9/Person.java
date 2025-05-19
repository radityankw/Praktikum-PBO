/* File : Person.java
 * Deskripsi : person database model
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

public class Person {
    private int id;
    private String name;
    
    public Person(String n) {
        name = n;
    }
    
    public Person(int i, String n) {
        id = i;
        name = n;
    }
    
    public  int getId(){
        return  id;
    }
    
    public String getName() {
        return  name;
    }
}
