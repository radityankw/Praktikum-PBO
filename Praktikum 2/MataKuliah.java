/* Nama File : MataKuliah.java
 * Deskripsi : berisi atribut dan method dalam class MataKuliah
 * Pembuat   : Radityantari Kusuma Wardani
 * Tanggal   : 27 Februari 2025
 */

public class MataKuliah {
    
    /***********ATRIBUT***********/
    private String idMatkul;
    private String nama;
    private int sks;

    /***********METHOD***********/
    public MataKuliah() {
        this.idMatkul = "-";
        this.nama = "-";
        this.sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatkul() {
        return idMatkul;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
