/* File : Segitiga.java
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;
    
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }

    @Override
    public double hitungLuas() {
        return  0.5*alas*tinggi;
    }
}
