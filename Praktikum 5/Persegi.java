/* Nama File : Persegijava
 * Deskripsi : berisi atribut dan method subclass Persegi
 * Pembuat   : Radityantari Kusuma Wardani
 * NIM       : 24060123130059
 * Tanggal   : 20 Maret 2025
 */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(){
        
    }

    public Persegi(double sisi,String warna,String border){
        super(4, warna, border);
        this.sisi = sisi;
    }
    public double getSisi(){
        return sisi; 
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
    
    public void printInfo(){
        //System.out.println("Warna Bangun Datar : "+getWarna());
        //System.out.println("Border Bangun Datar : "+getBorder());
        //System.out.println("Jumlah Sisi Bangun Datar : "+getJmlSisi());
        super.printInfo();
        System.out.println("sisi " + sisi);
    }
    
    public void zoomIn() {
        sisi = sisi * 1.1;
    }
    public void zoomOut() {
        sisi = sisi * 0.9;
    }
    public void zoom(int percent) {
        sisi = sisi * percent/100;
    }
}