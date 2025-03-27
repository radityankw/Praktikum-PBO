public abstract class Ruang {
    protected String kode;
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    protected int kapasitas;

    public Ruang() {}

    public Ruang(String kode, double panjang, double lebar, double tinggi,int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
        this.kapasitas = kapasitas;
    }
    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public double getLuas() {
        return panjang * lebar;
    }

    public abstract double getBiayaKebersihan();

    public void printInfo() {
        System.out.println("Kode Ruangan : " + kode);
        System.out.println("Panjang Ruangan : " + panjang);
        System.out.println("Lebar Ruangan : " + lebar);
        System.out.println("Tinggi Ruangan : " + tinggi);
        System.out.println("Kapasitas Ruangan : " + kapasitas);
        System.out.println("Luas Ruangan : " + getLuas());
    }
}
