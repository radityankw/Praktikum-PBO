import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS;

    public PNS() {
        counterPNS++;
    }

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        int masaKerja = Period.between(tgl_mulai_kerja, now).getYears();
        return masaKerja + 9;
    }

    public double hitungPajak() {
        return (10.0/100) * pendapatan;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP : " + nip);
    }
}
