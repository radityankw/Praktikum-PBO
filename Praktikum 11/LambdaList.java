/** 
 * File: LambdaList.java
 * Deskripsi: Implementasi Lambda pada List, digunakan sebagai parameter pada method.
 * Nama / NIM : Radityantari Kusuma Wardani / 24060123130059
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        
        mahasiswaList.forEach((nama)->System.out.println(nama));
    }
}
