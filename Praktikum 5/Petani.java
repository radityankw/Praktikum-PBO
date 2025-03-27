import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani;

    public Petani() {
        counterPetani++;
    }

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public String getAsalKota() {
        return asal_kota;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        int masaKerja = Period.between(tgl_mulai_kerja, now).getYears();
        return masaKerja + 0;
    }

    public double hitungPajak() {
        return 0;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota : " + asal_kota);
    }
}
