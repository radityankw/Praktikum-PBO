import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha;

    public Pengusaha() {
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        int masaKerja = Period.between(tgl_mulai_kerja, now).getYears();
        return masaKerja + 5;
    }

    public double hitungPajak() {
        return (15.0/100) * pendapatan;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP : " + npwp);
    }
}
