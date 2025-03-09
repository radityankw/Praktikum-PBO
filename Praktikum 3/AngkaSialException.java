/* Nama File : AngkaSialException.java
 * Deskripsi : eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat   : Radityantari Kusuma Wardani
 * NIM       : 24060123130059
 * Tanggal   : 27 Februari 2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }    
}
 