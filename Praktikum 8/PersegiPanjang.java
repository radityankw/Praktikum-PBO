/* File : PersegiPanjang.java
 * Deskripsi : implementasi PersegiPanjang sebagai BangunDatar
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungKeliling() {
        return  2*(panjang+lebar);
    }

    @Override
    public double hitungLuas() {
        return  panjang*lebar;
    }
}
