package edu.uph.SIAK.model;
import java.util.ArrayList;

public class JadwalKuliah {
    ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
    Dosen dosen;
    MataKuliah mataKuliah;
    RuanganVirtual ruanganVirtual;
    Tanggal tgl;

    public JadwalKuliah() {
    }


    public JadwalKuliah(ArrayList<Mahasiswa> mahasiswa, Dosen dosen, MataKuliah mataKuliah, RuanganVirtual ruanganVirtual, Tanggal tgl) {
        this.mahasiswa = mahasiswa;
        this.dosen = dosen;
        this.mataKuliah = mataKuliah;
        this.ruanganVirtual = ruanganVirtual;
        this.tgl = tgl;
    }


    public ArrayList<Mahasiswa> getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(ArrayList<Mahasiswa> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Dosen getDosen() {
        return this.dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public MataKuliah getMataKuliah() {
        return this.mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public RuanganVirtual getRuanganVirtual() {
        return this.ruanganVirtual;
    }

    public void setRuanganVirtual(RuanganVirtual ruanganVirtual) {
        this.ruanganVirtual = ruanganVirtual;
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa){
        this.mahasiswa.add(mahasiswa);
    }

    public void setTanggal(Tanggal tgl){
        this.tgl = tgl;
    }

    public Tanggal getTanggal(){
        return this.tgl;
    }

    public void tampilkanJadwalKuliah(){
        System.out.println("\t\t\t\tJadwal Kuliah");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Nama Matakuliah\t : "+getMataKuliah());
        System.out.println("Dosen\t\t : "+getDosen().toString());
        System.out.println("Ruangan\t\t : "+getRuanganVirtual());
        System.out.println("Hari, tanggal\t : "+getTanggal());
        System.out.println("Daftar Mahasiswa : ");
        System.out.println(" Nama \t\t\t StudentID \t\t Jenis Kelamin \t\tKelas");
        System.out.println("===============================================================================");
        for (Mahasiswa m : mahasiswa) {
            System.out.println(m.toString());
        }
    }

}
