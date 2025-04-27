/*
    Nama File   : Manajer.java
    Deskripsi   : atribut dan method class Programmer
    Nama        : Radityantari Kusuma Wardani
    NIM         : 24060123130059
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama){
        this.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
