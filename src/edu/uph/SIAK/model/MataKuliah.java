package edu.uph.SIAK.model;

/*
    Nama : Richard Hanitio
    NIM : 03082200014
*/

public class MataKuliah {
    //properti
    private String kodeMataKuliah;
    private String namaMataKuliah;
    private int SKS;


    //constructor
    public MataKuliah() {
    }


    public MataKuliah(String kodeMataKuliah, String namaMataKuliah, int SKS) {
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaMataKuliah = namaMataKuliah;
        this.SKS = SKS;
    }
    

    //getter setter
    public String getKodeMataKuliah() {
        return this.kodeMataKuliah;
    }

    public void setKodeMataKuliah(String kodeMataKuliah) {
        this.kodeMataKuliah = kodeMataKuliah;
    }

    public String getNamaMataKuliah() {
        return this.namaMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public int getSKS() {
        return this.SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

}
