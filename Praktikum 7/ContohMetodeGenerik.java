/* File : ContohMetodeGenerik.java
 * Deskripsi : Kelas yang berisi metode generik untuk menampilkan informasi perilaku objek turunan dari Anabul.
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

class ContohMetodeGenerik {
    public <G extends Anabul> void printInfo (Datum<G> D) {
        G g = D.getIsi();
        g.gerak();
        g.bersuara();
    }
}
