// Nama : Radityantari Kusuma Wardani
// NIM  : 24060123130059
public class LabNonKomputer extends RuangLaboratorium {
    private String mataKuliah;

    public LabNonKomputer() {}

    public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, double tarifKebersihan, String mataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa, tarifKebersihan);
        this.mataKuliah = mataKuliah;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mata Kuliah : " + mataKuliah);
    }
}
