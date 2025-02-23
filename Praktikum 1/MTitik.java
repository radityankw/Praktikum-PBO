/* Nama File : MTitik.java
 * Deskripsi : main class untuk class Titik
 * Pembuat   : Radityantari Kusuma Wardani
 * Tanggal   : 20 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();     //membuat obejk titik T1 (0,0) 
        T1.setAbsis(3);     //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);   //mengubah ordinat T1
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        T3.printTitik();

        Titik T4 = new Titik(3,5);
        T4.printTitik();
        
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Kuadran T4 adalah " + T4.getKuadran());
        System.out.println("Jarak ke Titik Pusat = " + T4.getJarakPusat());
        System.out.println("Jarak ke Titik T1 = " + T4.getJarak(T1));

        Titik T5 = T4.getRefleksiX();
        T5.printTitik();
    }
}
