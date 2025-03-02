/* Nama File : Mahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Radityantari Kusuma Wardani
 * Tanggal   : 27 Februari 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    
    /***********ATRIBUT***********/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /***********METHOD***********/
    public Mahasiswa() {
        this.nim = "-";
        this.nama = "-";
        this.prodi = "-";
        this.listMatKul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }    

    public String getProdi() {
        return prodi;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen D) {
        this.dosenWali = D;
    }

    public void setKendaraan(Kendaraan K) {
        this.kendaraan = K;
    }

    public void addMatKul(MataKuliah newMatKul) { 
        listMatKul.add(newMatKul);
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public int getJumlahSks() {
        int jumlah = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            jumlah += listMatKul.get(i).getSks();
        }
        return jumlah;
    }

    public void printMhs() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i=0;i<listMatKul.size();i++) {
            System.out.println("MK " + (i + 1) + " : " + listMatKul.get(i).getNama());

        }
        System.out.println("Nama Dosen Wali     : " + dosenWali.getNama());
        System.out.println("NIP Dosen Wali      : " + dosenWali.getNip());
        System.out.println("Prodi Dosen Wali    : " + dosenWali.getProdi());
        System.out.println("Nomor plat kendaraan: " + kendaraan.getNoPlat());
        System.out.println("Jenis kendaraan     : " + kendaraan.getJenis());
    }

}
