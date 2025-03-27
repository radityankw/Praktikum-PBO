import java.time.LocalDate;
public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    public Manusia() {
        counterMns++;
    }

    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tgl_mulai_kerja = tglMulaiKerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tgl_mulai_kerja);
        System.out.println("Alamat : " + alamat);
        System.out.println("Pendapatan : " + pendapatan);
    }
}
