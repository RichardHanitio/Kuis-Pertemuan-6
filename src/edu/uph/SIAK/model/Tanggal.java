package edu.uph.SIAK.model;

public class Tanggal {
    String hari;
    String tanggal;


    public Tanggal() {
    }


    public Tanggal(String hari, String tanggal) {
        this.hari = hari;
        this.tanggal = tanggal;
    }


    public String getHari() {
        return this.hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getTanggal() {
        return this.tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }


    @Override
    public String toString() {
        return getHari()+", "+getTanggal();
    }

}
