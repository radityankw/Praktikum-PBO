public class RuangDepartemen extends Ruang {
    private int jmlMeja;
    private int jmlKursi;
    private int jmlLemari;
    private Departemen departemen;

    public RuangDepartemen() {}

    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jmlMeja, int jmlKursi, int jmlLemari, Departemen departemen) {
        super(kode, panjang, lebar, tinggi, kapasitas); 
        this.jmlMeja = jmlMeja;
        this.jmlKursi = jmlKursi;
        this.jmlLemari = jmlLemari;
        this.departemen = departemen;
    }

    public int getJmlMeja() {
        return jmlMeja;
    }

    public void setJmlMeja(int jmlMeja) {
        this.jmlMeja = jmlMeja;
    }

    public int getJmlKursi() {
        return jmlKursi;
    }

    public void setJmlKursi(int jmlKursi) {
        this.jmlKursi = jmlKursi;
    }

    public int getJmlLemari() {
        return jmlLemari;
    }

    public void setJmlLemari(int jmlLemari) {
        this.jmlLemari = jmlLemari;
    }

    public Departemen getDepartemen() {
        return departemen;
    }

    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getBiayaKebersihan() {
        double tarif = (departemen != null) ? departemen.getTarifKebersihan() : 0;
        return getLuas() * tarif;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Meja     : " + jmlMeja);
        System.out.println("Jumlah Kursi    : " + jmlKursi);
        System.out.println("Jumlah Lemari   : " + jmlLemari);
        System.out.println("Departemen      : " + (departemen != null ? departemen.getNamaDepartemen() : "Tidak Ada"));
        System.out.println("Biaya Kebersihan: Rp" + getBiayaKebersihan());
    }
}
