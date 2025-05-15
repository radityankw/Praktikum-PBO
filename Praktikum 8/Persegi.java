/* File : Persegi.java
 * Deskripsi : implementasi Persegi sebagai BangunDatar
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

public class Persegi extends  BangunDatar{
    private double  sisi;
    
    public  Persegi(double  sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungKeliling() {
        return  4*sisi;
    }

    @Override
    public double hitungLuas() {
        return  sisi*sisi;
    }
}
