/* File : ReadSerializedPerson.java
 * Deskripsi : program untuk serialisasi objek Person
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

import java.io.*;
class Person implements Serializable{
    private  String name;
    public Person(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serialized person name = " + person.getName());
        } catch(Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
