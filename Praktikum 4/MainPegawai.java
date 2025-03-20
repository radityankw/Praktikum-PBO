/* Nama File : MainPegawai.java
 * Deskripsi : berisi driver untuk superclass Pegawai beserta turunannya 
 * Pembuat   : Radityantari Kusuma Wardani
 * NIM       : 24060123130059
 * Tanggal   : 16 Maret 2025
 */

import java.time.LocalDate;

public class MainPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("12345", "112233", "Dr. Andi", 
            LocalDate.of(1975, 5, 20), LocalDate.of(2000, 3, 15), 7000000, "Fakultas Teknik");

        DosenTamu dosenTamu = new DosenTamu("67890", "445566", "Dr. Budi", 
            LocalDate.of(1980, 6, 15), LocalDate.of(2015, 8, 10), 5000000, "Fakultas Ekonomi", 
            LocalDate.of(2025, 12, 31));

        Tendik tendik = new Tendik("54321", "Cakra", LocalDate.of(1982, 2, 10), 
            LocalDate.of(2010, 9, 5), 4000000, BidangTendik.Akademik);

        System.out.println("=== Info Pegawai ===");
        dosenTetap.printInfo();
        System.out.println("--------------------");
        dosenTamu.printInfo();
        System.out.println("--------------------");
        tendik.printInfo();
    }
}
