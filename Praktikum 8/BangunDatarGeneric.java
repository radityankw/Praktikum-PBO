/* File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk bangun datar
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

public class BangunDatarGeneric<T1 extends  BangunDatar>{
    private  T1 bangunDatar;
    
    public  void set(T1 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }
    
    public  T1 get() {
        return  bangunDatar;
    }
    
    public  double hitungKeliling() {
        return  bangunDatar.hitungKeliling();
    }

    public  double hitungLuas() {
        return  bangunDatar.hitungLuas();
    }
}
//Jika T diganti dengan T1 dll. itu tidak masalah asalkan nama yang digunakan di parameter generik
//harus sama dengan nama yang digunakan di seluruh class. 
