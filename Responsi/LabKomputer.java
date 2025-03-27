// Nama : Radityantari Kusuma Wardani
// NIM  : 24060123130059
public class LabKomputer extends RuangLaboratorium {
    private int jumlahKomputer;

    public LabKomputer() {}
    
    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, double tarifKebersihan, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa, tarifKebersihan);
        this.jumlahKomputer = jumlahKomputer;
    }

    public int getJumlahKomputer() {
        return jumlahKomputer;
    }

    public void setJumlahKomputer(int jumlahKomputer) {
        this.jumlahKomputer = jumlahKomputer;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
    }
}
