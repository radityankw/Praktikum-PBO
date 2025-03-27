// Nama : Radityantari Kusuma Wardani
// NIM  : 24060123130059
public class RuangDosen extends Ruang {
    private String namaDosen;
    private int jmlMeja;
    private int jmlKursi;
    private Departemen departemen;

    public RuangDosen() {}
    
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int jmlMeja, int jmlKursi, Departemen departemen) {
        super(kode, panjang, lebar, tinggi, kapasitas); 
        this.namaDosen = namaDosen;
        this.jmlMeja = jmlMeja;
        this.jmlKursi = jmlKursi;
        this.departemen = departemen;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen= namaDosen;
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
        System.out.println("Nama Dosen : " + namaDosen);
        System.out.println("Jumlah Meja : " + jmlMeja);
        System.out.println("Jumlah Kursi : " + jmlKursi);
        System.out.println("Departemen : " + departemen);
        System.out.printf("Biaya Kebersihan : Rp", getBiayaKebersihan());
    }
}
