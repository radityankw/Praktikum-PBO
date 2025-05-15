/* File : Burung.java
 * Deskripsi : berisi atribut dan method untuk subclass Burung
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi cuit.");
    }
}
