/* Nama File : BangunDatar.java

 * Deskripsi : berisi atribut dan method superclass BangunDatar

 * Pembuat   : Radityantari Kusuma Wardani

 * NIM       : 24060123130059

 * Tanggal   : 20 Maret 2025

 */



public abstract class BangunDatar {

    protected int jlmSisi;

    protected String warna;

    protected String border;

    protected static int counterBangunDatar = 0;



    public BangunDatar() {

        counterBangunDatar++;

    }



    public BangunDatar(int jlmSisi,String warna,String border){

        this.jlmSisi = jlmSisi;

        this.warna = warna;

        this.border = border;

        counterBangunDatar++;

    }



    public static void printCounterBangunDatar() {

        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);

    }



    public int getJmlSisi() {

        return jlmSisi;

    }



    public void setJmlSisi(int jlmSisi) {

        this.jlmSisi = jlmSisi;

    }



    public String getWarna() {

        return warna;

    }



    public void setWarna(String warna) {

        this.warna = warna;

    }



    public String getBorder() {

        return border;

    }



    public void setBorder(String border) {

        this.border = border;

    }



    public abstract double getLuas();



    public abstract double getKeliling();



    public boolean isEqualLuas(BangunDatar X){

        return this.getLuas() == X.getLuas();

    }



    public boolean isEqualKeliling(BangunDatar X){

        return this.getKeliling() == X.getKeliling();

    }

    public void printInfo() {

        System.out.println("Jumlah sisi: " + jlmSisi);

        System.out.println("Warna: " + warna);

        System.out.println("Border: " + border);

    }

}
