/* Nama File : MDosenKendaraanMatKul.java
 * Deskripsi : main class untuk class Dosen, Kendaraan, dan MataKuliah
 * Pembuat   : Radityantari Kusuma Wardani
 * Tanggal   : 2 Maret 2025
 */

public class MDosenKendaraanMatKul {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("1234", "Andi", "Informatika");
        
        Kendaraan kendaraan1 = new Kendaraan("H5678BC", "Mobil");
        
        MataKuliah PBO = new MataKuliah("PBO","Pemrograman Berorientasi Objek",3);
        MataKuliah MBD = new MataKuliah("MBD","Manajemen Basis Data",3);
        
        System.out.println("----- Data Dosen -----");
        System.out.println("NIP  : " + dosen1.getNip());
        System.out.println("Nama : " + dosen1.getNama());
        System.out.println("Prodi: " + dosen1.getProdi());

        // Menampilkan informasi Kendaraan
        System.out.println("\n----- Data Kendaraan -----");
        System.out.println("Nomor Plat: " + kendaraan1.getNoPlat());
        System.out.println("Jenis     : " + kendaraan1.getJenis());

        // Menampilkan informasi Mata Kuliah
        System.out.println("\n----- Data Mata Kuliah -----");
        System.out.println("ID     : " + PBO.getIdMatkul());
        System.out.println("Nama   : " + PBO.getNama());
        System.out.println("SKS    : " + PBO.getSks());

        System.out.println("\nID     : " + MBD.getIdMatkul());
        System.out.println("Nama   : " + MBD.getNama());
        System.out.println("SKS    : " + MBD.getSks());
    }
}
