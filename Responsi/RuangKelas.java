public class RuangKelas extends Ruang {
    private int kursiTersedia;
    private int kursiRusak;
    private double tarifKebersihan;

    public RuangKelas() {

    }

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int kursiTersedia, int kursiRusak, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        setKursiTersedia(kursiTersedia);
        setKursiRusak(kursiRusak);
        setTarifKebersihan(tarifKebersihan);
    }

    public int getKursiTersedia() {
        return kursiTersedia;
    }

    public void setKursiTersedia(int kursiTersedia) {
        this.kursiTersedia = kursiTersedia;
    }

    public int getKursiRusak() {
        return kursiRusak;
    }

    public void setKursiRusak(int kursiRusak) {
        this.kursiRusak = kursiRusak;
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
        System.out.println("Jumlah Kursi Tersedia : " + kursiTersedia);
        System.out.println("Jumlah Kursi Rusak : " + kursiRusak);
        System.out.println("Tarif Kebersihan : " + tarifKebersihan);
        System.out.println("Biaya Kebersihan : " + getBiayaKebersihan());
    }
}
