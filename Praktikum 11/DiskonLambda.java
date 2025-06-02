/** 
 * File DiskonLambda.java
 * Deskripsi: Ekspresi lambdadasar, digunakan untuk menghitung diskon
 * Nama / NIM : Radityantari Kusuma Wardani / 24060123130059
 */

interface IDiskon {
    public double hitungDiskon(int harga);
}
public class DiskonLambda {
    public static void main(String[] args) {
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3); 
            }
        };
        //dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        //dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1); 
        };
        // Perbedaan implementasi diskonLebaran dan diskonBiasa yaitu:
        // diskonLebaran tidak memakai block statement, melainkan hanya single expression,
        // sedangkan diskonBiasa memakai block statement (memakai kurawal dan return)
        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(45000));
    }
}
