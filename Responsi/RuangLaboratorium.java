public class RuangLaboratorium extends Ruang {
    protected String namaLab;
    protected double hargaSewa;
    protected double tarifKebersihan;

    public RuangLaboratorium() {}

    public RuangLaboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
        this.tarifKebersihan = tarifKebersihan;
    }

    public String getNamaLab() {
        return namaLab;
    }

    public void setNamaLab(String namaLab) {
        this.namaLab = namaLab;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public double getTarifKebersihan() {
        return tarifKebersihan;
    }

    public void setTarifKebersihan(double tarifKebersihan) {
        this.tarifKebersihan = tarifKebersihan;
    }

    @Override
    public double getBiayaKebersihan() {
        return tarifKebersihan * getLuas();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Nama Laboratorium : " + namaLab);
        System.out.println("Harga Sewa : " + hargaSewa);
        System.out.println("Tarif Kebersihan : " + tarifKebersihan);
        System.out.println("Biaya Kebersihan : " + getBiayaKebersihan());
    }
}
