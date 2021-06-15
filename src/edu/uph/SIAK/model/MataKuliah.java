package edu.uph.SIAK.model;

public class MataKuliah {
    String nama;

    public MataKuliah() {
    }

    public MataKuliah(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    @Override
    public String toString() {
        return nama;
    }

}
