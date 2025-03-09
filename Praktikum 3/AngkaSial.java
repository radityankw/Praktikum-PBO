/* Nama File : AngkaSial.java
 * Deskripsi : program penggunaan exception buatan sendiri
 *             pengenalan klausa 'throw' dan 'throws'
 * Pembuat   : Radityantari Kusuma Wardani
 * NIM       : 24060123130059
 * Tanggal   : 27 Februari 2025
 */

public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka +" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(11);
            as.cobaAngka(10);
            as.cobaAngka(13);
        } catch(AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

//Jika eksepsi terjadi, baris ke-14 tidak akan dieksekusi.
//Dan baris ke-23 akan dieksekusi 
//karena kode di baris itu menangkap (catch) eksepsi yang dilempar (throw) oleh kode di baris ke-12.