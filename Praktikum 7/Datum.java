/* File : Datum.java
 * Deskripsi : Kelas generik Datum yang menyimpan satu objek turunan dari Anabul
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

class Datum<G extends Anabul> {
    private G isi;
    
    public G getIsi() {
        return isi;
    }
    public void setIsi(G x) {
        isi = x;
    }
}
