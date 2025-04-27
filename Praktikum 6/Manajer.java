/*
    Nama File   : Manajer.java
    Deskripsi   : atribut dan method class Manajer
    Nama        : Radityantari Kusuma Wardani
    NIM         : 24060123130059
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        this.setNama(nama); 
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
