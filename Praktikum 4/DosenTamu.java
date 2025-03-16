/* Nama File : DosenTamu.java
 * Deskripsi : berisi atribut dan method subclass DosenTamu
 * Pembuat   : Radityantari Kusuma Wardani
 * NIM       : 24060123130059
 * Tanggal   : 16 Maret 2025
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Dosen{
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;

    public DosenTamu() {

    }

    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public LocalDate getTglBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    public void setTglBerakhirKontrak(LocalDate tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public double hitungTunjangan() {
        long tahun = ChronoUnit.YEARS.between(tmt, LocalDate.now());
        double tunjanganTahunan = 0.025 * tahun * gajiPokok;  
        return tunjanganTahunan;
    }

    public long hitungSisaKontrak() {
        return ChronoUnit.MONTHS.between(LocalDate.now(), tanggalBerakhirKontrak);
    }
    
    @Override
    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("NIDK: " + nidk);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggalLahir));
        System.out.println("TMT: " + formatTanggal(tmt));
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Sisa Masa Kontrak: " + hitungSisaKontrak() + " bulan");
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + hitungTunjangan());
    }
}


