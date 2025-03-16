/* Nama File : DosenTetap.java
 * Deskripsi : berisi atribut dan method subclass DosenTetap
 * Pembuat   : Radityantari Kusuma Wardani
 * NIM       : 24060123130059
 * Tanggal   : 16 Maret 2025
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DosenTetap extends Dosen {
    private String nidn;
    private final int bup = 65;

    public DosenTetap() {

    }
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public double hitungTunjangan() {
        long tahun = ChronoUnit.YEARS.between(tmt, LocalDate.now());
        double tunjanganTahunan = 0.02 * tahun * gajiPokok;  
        return tunjanganTahunan;
    }
    

    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(bup).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggalLahir));
        System.out.println("TMT: " + formatTanggal(tmt));
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("BUP: " + formatTanggal(hitungBUP()));
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + hitungTunjangan());
    }
}
