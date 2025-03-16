/* Nama File : Pegawai.java
 * Deskripsi : berisi atribut dan method superclass Pegawai
 * Pembuat   : Radityantari Kusuma Wardani
 * NIM       : 24060123130059
 * Tanggal   : 16 Maret 2025
 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Pegawai {
    protected String nip, nama;
    protected LocalDate tanggalLahir, tmt;
    protected double gajiPokok;

    public Pegawai() {

    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;    
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;    
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;    
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;    
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;    
    }

    public String hitungMasaKerja() {
        long tahun = ChronoUnit.YEARS.between(tmt, LocalDate.now());
        long bulan = ChronoUnit.MONTHS.between(tmt.plusYears(tahun), LocalDate.now());
        return tahun + " tahun " + bulan + " bulan";
    }

    public String formatTanggal(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id"));
        return date.format(formatter);
    }
    


    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("TMT: " + tmt);
        System.out.println("Masa Kerja: " + this.hitungMasaKerja());
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
