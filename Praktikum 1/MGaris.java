/* Nama File : MTitik.java
 * Deskripsi : main class untuk class Titik
 * Pembuat   : Radityantari Kusuma Wardani
 * Tanggal   : 23 Februari 2025
 */

 public class MGaris {
    public static void main(String[] args) {
        
        Titik t1 = new Titik(2, 4);
        Titik t2 = new Titik(6, 8);
        
        Garis garis1 = new Garis(t1, t2);

        System.out.println("Garis 1:");
        garis1.printGaris();
        System.out.println("Panjang garis: " + garis1.getPanjang());
        System.out.println("Gradien garis: " + garis1.getGradien());
        System.out.println("Titik tengah garis: (" + garis1.titikTengahGaris().getAbsis() + ", " + garis1.titikTengahGaris().getOrdinat() + ")");
        System.out.println("Persamaan garis: " + garis1.getPersamaanGaris());
        
        Titik t3 = new Titik(3, 5);
        Titik t4 = new Titik(6, 9);
        Garis garis2 = new Garis(t3, t4);
        
        System.out.println("\nGaris 2:");
        garis2.printGaris();
        
        System.out.println("Apakah garis 1 dan garis 2 sejajar? " + garis1.isSejajar(garis2));
        System.out.println("Apakah garis 1 dan garis 2 tegak lurus? " + garis1.isTegakLurus(garis2));
    }
}
