package edu.uph.SIAK.model;

public class Mahasiswa {
    // Nama Mahasiswa
    String nama;
    // Nomor induk mahasiswa
    String studentID;
    // 1 wanita, 0 pria
    boolean jenisKelamin;
    String kelas;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String studentID, boolean jenisKelamin, String kelas) {
        this.nama = nama;
        this.studentID = studentID;
        this.jenisKelamin = jenisKelamin;
        this.kelas = kelas;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public boolean isJenisKelamin() {
        return this.jenisKelamin;
    }

    public boolean getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getKelas() {
        return this.kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    @Override
    public String toString() {
        return "" +
            " " + getNama() + "\t\t\t" +
            " " + getStudentID() + "\t\t" +
            " " + (isJenisKelamin()?"Wanita":"Pria")+"\t\t\t"+
            " " + getKelas();
    }
    


}
