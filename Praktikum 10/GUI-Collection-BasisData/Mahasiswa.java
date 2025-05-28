/* File : Mahasiswa.java
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author DELL
 */
public class Mahasiswa {
    private int id;
    private String name;
    
    public Mahasiswa() {
        this.id = 9999;
        this.name = "-";
    }
    
    public Mahasiswa(int id,String nama) {
        this.id = id;
        this.name = nama;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String nama) {
        this.name = nama;
    }
    
    @Override
    public String toString() {
        return "Mahasiswa(" + "id=" + id + ", nama=" + name + ')';
    }
}
