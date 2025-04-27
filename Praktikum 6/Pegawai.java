/*
    Nama File   : Manajer.java
    Deskripsi   : atribut dan method superclass Pegawai
    Nama        : Radityantari Kusuma Wardani
    NIM         : 24060123130059
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama : " + getNama() +", " + "Gaji Pokok : " + getGajiPokok());
    }
}
