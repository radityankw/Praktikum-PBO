/*
    Nama File   : Manajer.java
    Deskripsi   : main class untuk Anabul dan turunannya
    Nama        : Radityantari Kusuma Wardani
    NIM         : 24060123130059
*/

import java.util.ArrayList;

public class MAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Kitty");
        Anabul anjing = new Anjing("Doggy");
        Burung burung = new Burung("Tweety");

        ArrayList<Anabul> hewanPeliharaan = new ArrayList<>();
        hewanPeliharaan.add(kucing);
        hewanPeliharaan.add(anjing);
        hewanPeliharaan.add(burung); 

        System.out.println("Daftar Anabul:");
        for (Anabul hewan : hewanPeliharaan) {
            hewan.gerak();
            hewan.bersuara();
            System.out.println();
        }
    }
}
