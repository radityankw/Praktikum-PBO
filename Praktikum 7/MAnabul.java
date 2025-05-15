/* File : MAnabul.java
 * Deskripsi : Main class untuk Anabul dan turunannya beserta kelas generik
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

public class MAnabul {
    public static void main(String[] args) {
        // kamus
        ContohMetodeGenerik C = new ContohMetodeGenerik();
        Datum<Anabul> datum = new Datum<>();

        Kucing k = new Kucing("Kitty");
        Anjing a = new Anjing("Doggy");
        Burung b = new Burung("Tweety");

        datum.setIsi(k);
        System.out.println("=== KUCING ===");
        C.printInfo(datum);

        datum.setIsi(a);
        System.out.println("\n=== ANJING ===");
        C.printInfo(datum);

        datum.setIsi(b);
        System.out.println("\n=== BURUNG ===");
        C.printInfo(datum);
    }
}
