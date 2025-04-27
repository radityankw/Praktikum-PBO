/*
    Nama File   : Manajer.java
    Deskripsi   : atribut dan method class Anjing
    Nama        : Radityantari Kusuma Wardani
    NIM         : 24060123130059
*/

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    public void bersuara() {
        System.out.println(getNama() + " berbunyi guk-guk.");
    }
}
