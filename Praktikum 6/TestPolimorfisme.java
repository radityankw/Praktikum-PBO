/*
    Nama File   : Manajer.java
    Deskripsi   : main class untuk kasus polimorfisme
    Nama        : Radityantari Kusuma Wardani
    NIM         : 24060123130059
*/

import java.util.ArrayList;
public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        System.out.println("Nama : Radityantari Kusuma Wardani");
        System.out.println("NIM : 24060123130059");
        System.out.println();
        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/*2. Polimorfisme memungkinkan objek-objek dari kelas turunan (Manajer, Programmer) untuk diperlakukan 
     sebagai objek dari kelas induk (Pegawai) saat disimpan dalam satu koleksi (ArrayList<Pegawai>) 
     dan diproses secara seragam.*/

/*3. Harus membuat banyak ArrayList atau variabel berbeda untuk setiap tipe pegawai 
 *   Harus memeriksa tipe objek secara manual sebelum memanggil method yang sesuai */