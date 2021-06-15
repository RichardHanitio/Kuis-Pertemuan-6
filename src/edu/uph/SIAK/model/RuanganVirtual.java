package edu.uph.SIAK.model;

public class RuanganVirtual {
    String nama;

    public RuanganVirtual() {
    }

    public RuanganVirtual(String nama) {
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
