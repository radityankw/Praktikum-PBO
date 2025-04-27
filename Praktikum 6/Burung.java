/*
    Nama File   : Manajer.java
    Deskripsi   : atribut dan method class Burung
    Nama        : Radityantari Kusuma Wardani
    NIM         : 24060123130059
*/

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(getNama() + " bergerak dengan terbang.");
    }

    public void bersuara() {
        System.out.println(getNama() + " berbunyi cuit.");
    }
}
