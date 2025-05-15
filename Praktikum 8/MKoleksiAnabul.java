/* File : MKoleksiAnabul.java
 * Deskripsi : main class untuk generik Anabul
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

import java.util.Random;

public class MKoleksiAnabul {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksiAnabul = new KoleksiAnabul<>(10);

        // Buat 10 Anabul acak
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
            int jenis = rand.nextInt(3); // 0: Kucing, 1: Anjing, 2: Burung
            String nama = "Anabul-" + i;

            switch (jenis) {
                case 0:
                    koleksiAnabul.add(new Kucing(nama));
                    break;
                case 1:
                    koleksiAnabul.add(new Anjing(nama));
                    break;
                case 2:
                    koleksiAnabul.add(new Burung(nama));
                    break;
            }
        }

        // Tampilkan semua isi koleksi
        System.out.println("== Koleksi Anabul ==");
        koleksiAnabul.showAll();
    }
}
