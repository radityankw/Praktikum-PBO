/* Nama File : Tendik.java
 * Deskripsi : berisi atribut dan method subclass Tendik
 * Pembuat   : Radityantari Kusuma Wardani
 * NIM       : 24060123130059
 * Tanggal   : 16 Maret 2025
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

enum BidangTendik {
    Akademik, Kemahasiswaan, Sumber_Daya
}

public class Tendik extends Pegawai {
    private BidangTendik bidang;
    private final int bup = 55;

    public Tendik() {

    }

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, BidangTendik bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public BidangTendik getBidang() {
        return bidang;
    }

    public void setBidang(BidangTendik bidang) {
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        long tahun = ChronoUnit.YEARS.between(tmt, LocalDate.now());
        double tunjanganTahunan = 0.01 * tahun * gajiPokok;  
        return tunjanganTahunan;
    }

    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(bup).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggalLahir));
        System.out.println("TMT: " + formatTanggal(tmt));
        System.out.println("Jabatan: Tenaga Kependidikan");
        System.out.println("Bidang: " + bidang);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("BUP: " + formatTanggal(hitungBUP()));
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + hitungTunjangan());
    }
}
