/* File : Kucing.java
 * Deskripsi : berisi atribut dan method untuk subclass Kucing
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi meong.");
    }
}