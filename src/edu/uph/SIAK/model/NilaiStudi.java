package edu.uph.SIAK.model;

/*
    Nama : Richard Hanitio
    NIM : 03082200014
*/

public class NilaiStudi {
    //properti
    private MataKuliah mataKuliah;
    private char nilaiHuruf;

    //constructor
    public NilaiStudi() {
    }

    public NilaiStudi(MataKuliah mataKuliah, char nilaiHuruf) {
        this.mataKuliah = mataKuliah;
        this.nilaiHuruf = nilaiHuruf;
    }

    //getter setter
    public MataKuliah getMataKuliah() {
        return this.mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public char getNilaiHuruf() {
        return this.nilaiHuruf;
    }

    public void setNilaiHuruf(char nilaiHuruf) {
        this.nilaiHuruf = nilaiHuruf;
    }

    //method
    public double getNilaiAngka() {
        double nilaiAngka = 0.0;
        switch (getNilaiHuruf()) {
            case 'A' : 
                nilaiAngka = 4.0;
                break;
            case 'B' :
                nilaiAngka = 3.0;
                break;
            case 'C' :
                nilaiAngka = 2.0;
                break;
            case 'D' :
                nilaiAngka = 1.0;
                break;
            default :
                nilaiAngka = 0.0;
        }
        return nilaiAngka;
    }

}
