/* Nama File : ExceptionOnArray.java
 * Deskripsi : program penggunaan exception menggunakan class library Java
 * Pembuat   : Radityantari Kusuma Wardani
 * NIM       : 24060123130059
 * Tanggal   : 27 Februari 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally{
            System.out.println("clean up code...");
        }
    }
}
