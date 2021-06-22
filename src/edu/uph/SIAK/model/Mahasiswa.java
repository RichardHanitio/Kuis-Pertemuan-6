package edu.uph.SIAK.model;

/*
    Nama : Richard Hanitio
    NIM : 03082200014
*/

public class Mahasiswa {
    //properti
    private String nama;

    //constructor
    public Mahasiswa() {
    }

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    //getter setter
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
