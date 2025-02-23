/* Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Radityantari Kusuma Wardani
 * Tanggal   : 20 Februari 2025
 */

public class Garis {
    /*************ATRIBUT*************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /*************METHOD*************/
    //konstruktor untuk membuat garis
    Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    //mengembalikan nilai counterGaris
    static int getCounterGaris() {
        return counterGaris;
    }

    //mengembalikan nilai titikAwal
    Titik getTitikAwal() {
        return titikAwal;
    }

    //mengembalikan nilai titikAkhir
    Titik getTitikAkhir() {
        return titikAkhir;
    }

    //mengeset titikAwal Garis dengan nilai baru T1
    void setTitikAwal(Titik T) {
        titikAwal = T;
    }

    //mengeset titikAkhir Garis dengan nilai baru T2
    void setTitikAkhir(Titik T) {
        titikAkhir = T;
    }

    //mengembalikan panjang sebuah garis
    double getPanjang() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    } 

    //mengembalikan gradien sebuah garis
    double getGradien() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (deltaX == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return deltaY/deltaX;
    }

    //mengembalikan titik tengah sebuah garis
    Titik titikTengahGaris() {
        double absis = (titikAkhir.getAbsis() + titikAwal.getAbsis()) / 2;
        double ordinat = (titikAkhir.getOrdinat() + titikAwal.getOrdinat()) / 2;
        return new Titik(absis,ordinat);
    }

    //mengecek apakah 2 buah garis sejajar
    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    //mengecek apakah 2 buah garis saling tegak lurus
    boolean isTegakLurus(Garis G) {
        return Math.abs(this.getGradien() * G.getGradien() + 1) < 1e-9;
    }

    //mencetak titikAwal dan titikAkhir garis
    void printGaris() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");

    }

    double getIntersep(double gradien) {
        return titikAwal.getOrdinat() - (gradien * titikAwal.getAbsis());
    }

    String getPersamaanGaris() {
        double gradien = getGradien();
        if (gradien == Double.POSITIVE_INFINITY) {
            return "Garis vertikal: x = " + titikAwal.getAbsis();
        }
        double intersep = getIntersep(gradien);
        return String.format("y = %.2fx + %.2f", gradien, intersep);
    }
}
