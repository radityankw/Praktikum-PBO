/* File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic bangun datar
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling Lingkaran : " + bdg.hitungKeliling());
        System.out.println("Luas Lingkaran : " + bdg.hitungLuas());
        System.out.println("Tipe generic : " + bdg.get().getClass().getName());

        Persegi p = new Persegi(4);
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<>();
        bdgPersegi.set(p);
        System.out.println("Keliling Persegi: " + bdgPersegi.hitungKeliling());
        System.out.println("Luas Persegi: " + bdgPersegi.hitungLuas());
        System.out.println("Tipe generic: " + bdgPersegi.get().getClass().getName());

        PersegiPanjang pp = new PersegiPanjang(5, 3);
        BangunDatarGeneric<PersegiPanjang> bdgPP = new BangunDatarGeneric<>();
        bdgPP.set(pp);
        System.out.println("Keliling Persegi Panjang: " + bdgPP.hitungKeliling());
        System.out.println("Luas Persegi Panjang: " + bdgPP.hitungLuas());
        System.out.println("Tipe generic: " + bdgPP.get().getClass().getName());

        Segitiga s = new Segitiga(3, 4);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<>();
        bdgSegitiga.set(s);
        System.out.println("Keliling Segitiga: " + bdgSegitiga.hitungKeliling());
        System.out.println("Luas Segitiga: " + bdgSegitiga.hitungLuas());
        System.out.println("Tipe generic: " + bdgSegitiga.get().getClass().getName());
    }
}
