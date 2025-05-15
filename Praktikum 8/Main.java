/* File : Main.java
 * Deskripsi : main class untuk generik karakter
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>(10);

        for (char c = 'A'; c <= 'J'; c++) {
            koleksiKarakter.add(c);
        }

        System.out.print("Isi koleksi: ");
        koleksiKarakter.showAll();

        koleksiKarakter.setIsi(0, 'Z');

        koleksiKarakter.delete(3);

        System.out.print("Setelah edit dan delete: ");
        koleksiKarakter.showAll();
    }
}
