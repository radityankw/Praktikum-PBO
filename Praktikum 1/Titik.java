/* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Radityantari Kusuma Wardani
 * Tanggal   : 20 Februari 2025
 */
public class Titik {
    /*************ATRIBUT*************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*************METHOD*************/
    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengana nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengana nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ","+ ordinat + ")");
    }


    int getKuadran() {
        if (absis >= 0 && ordinat >= 0) {
            return 1;
        } else if (absis < 0 && ordinat >= 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        }
        else {
            return 4;
        }
    }

    double getJarakPusat() {
        return Math.sqrt((absis*absis)+(ordinat*ordinat));
    }

    double getJarak(Titik T){
        return Math.sqrt(((absis - T.getAbsis())*(absis - T.getAbsis()))+((ordinat - T.getOrdinat()))*((ordinat - T.getOrdinat())));
    }

    void refleksiX() {
        ordinat = ordinat * (-1);
    }

    void refleksiY() {
        absis = absis * (-1);
    }

    Titik getRefleksiX() {
        return new Titik (getAbsis(),getOrdinat()*(-1));
    }

    Titik getRefleksiY() {
        return new Titik (getAbsis()*(-1),getOrdinat());
    }
} //end class Titik
