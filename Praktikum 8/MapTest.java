/* File : MapTest.java
 * Deskripsi : program yang menggunakan generic untuk pasangan Kunci-Nilai
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

import  java.util.*;
public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"satu");
        map.put(2,"dua");
        System.out.println(map.get(1));
        Set<Integer> key = map.keySet();
        //iterasinya dilakukan pada key yang diambil dari keySet
        for (Integer k : key) {
            System.out.println("Kunci: " + k + ", Nilai: " + map.get(k));
        }
    }
}
