/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi Lambda pada Map, digunakan sebagai parameter pada method.
 * Nama / NIM : Radityantari Kusuma Wardani / 24060123130059
 */

import java.util.Map;
import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("100", "Adi");
        mahasiswa.put("101", "Bambang");
        mahasiswa.put("102", "Cici");
        mahasiswa.put("103", "Didi");
        mahasiswa.forEach((nim, nama)->System.out.println("NIM: "+ nim + " Nama: "+ nama));
        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " Nama: " + nama);
        });
    }
}
