/*
    Nama File   : Manajer.java
    Deskripsi   : atribut dan method superclass Anabul
    Nama        : Radityantari Kusuma Wardani
    NIM         : 24060123130059
*/

public class Anabul {
    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void gerak() {
        System.out.println("Anabul bergerak");
    }

    public void bersuara() {
        System.out.println("Anabul bersuara");
    }
}
