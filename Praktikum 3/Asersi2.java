/* Nama File : AngkaSial.java
 * Deskripsi : program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol.
 * Pembuat   : Radityantari Kusuma Wardani
 * NIM       : 24060123130059
 * Tanggal   : 27 Februari 2025
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "+ kelilingLingkaran);
    }
}

//Asersi tidak cocok untuk validasi input karena program akan terus berjalan meskipun inputnya <= 0. 
//Sebaiknya menggunakan exeption untuk memvalidasi input jariJari di konstruktor Lingkaran.