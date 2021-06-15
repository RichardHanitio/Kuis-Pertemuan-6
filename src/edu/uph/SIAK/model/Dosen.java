package edu.uph.SIAK.model;

public class Dosen {
    // Nama dosen
    String nama;
    // Nomor induk dosen
    String dosenID;
    // 1 wanita, 0 pria
    boolean jenisKelamin;

    public Dosen() {
    }

    public Dosen(String nama, String dosenID, boolean jenisKelamin) {
        this.nama = nama;
        this.dosenID = dosenID;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDosenID() {
        return this.dosenID;
    }

    public void setStudentID(String dosenID) {
        this.dosenID = dosenID;
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

    @Override
    public String toString() {
        return getNama() + "\t" + getDosenID() + "   "
                + (isJenisKelamin() ? "Wanita" : "Pria");
    }
}
