/* Nama File : Lingkaran.java
 * Deskripsi : berisi atribut dan method subclass Lingkaran
 * Pembuat   : Radityantari Kusuma Wardani
 * NIM       : 24060123130059
 * Tanggal   : 16 Maret 2025
 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(0,warna,border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public void zoomIn() {
        jari = jari * 1.1;
    }
    public void zoomOut() {
        jari = jari * 0.9;
    }
    public void zoom(int percent) {
        jari = jari * percent/100;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}
