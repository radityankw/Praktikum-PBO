public class Departemen {
    private String namaDept;
    private String ketuaDept;
    private double tarifKebersihan;

    public Departemen() {}

    public Departemen(String namaDept, String ketuaDept, double tarifKebersihan) {
        this.namaDept = namaDept;
        this.ketuaDept=ketuaDept;
        this.tarifKebersihan=tarifKebersihan;
    }

    public String getNamaDepartemen() {
        return namaDept;
    }

    public void setNamaDepartemen(String namaDept) {
        this.namaDept = namaDept;
    }

    @Override
    public String toString() {
        return namaDept;
    }

    public String getKetuaDepartemen() {
        return ketuaDept;
    }

    public void setKetuaDepartemen(String ketuaDept) {
        this.ketuaDept = ketuaDept;
    }

    public double getTarifKebersihan() {
        return tarifKebersihan;
    }

    public void setTarifKebersihan(double tarifKebersihan) {
        this.tarifKebersihan = tarifKebersihan;
    }

    public void printInfo() {
        System.out.println("Nama Departemen : " + namaDept);
        System.out.println("Ketua Departemen : " + ketuaDept);
        System.out.println("Tarif Kebersihan : " + tarifKebersihan);
    }
}
