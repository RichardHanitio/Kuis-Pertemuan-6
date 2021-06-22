package edu.uph.SIAK.model;
import java.util.ArrayList;

/*
    Nama : Richard Hanitio
    NIM : 03082200014
*/

public class KartuHasilStudi {
    //properti
    private int semester;
    private Mahasiswa mahasiswa;
    private ArrayList<NilaiStudi> listNilaiStudi = new ArrayList<>();

    //constructor
    public KartuHasilStudi() {
    }

    public KartuHasilStudi(int semester, Mahasiswa mahasiswa) {
        this.semester = semester;
        this.mahasiswa = mahasiswa;
    }

    //getter setter
    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public ArrayList<NilaiStudi> getNilaiStudi() {
        return this.listNilaiStudi;
    }

    public void setNilaiStudi(ArrayList<NilaiStudi> nilaiStudi) {
        this.listNilaiStudi = nilaiStudi;
    }
    
    //method
    public double getIPK() {
        double total1 = 0.0, total2 = 0.0;
        for(NilaiStudi i : listNilaiStudi){
            total1 += i.getNilaiAngka() * i.getMataKuliah().getSKS();
            total2 += i.getMataKuliah().getSKS();
        }
        return total1/total2;
    }   

    public int totalSKS() {
        int total = 0;
        for(NilaiStudi i : listNilaiStudi) {
             total += i.getMataKuliah().getSKS();
        }
        return total;
    }

    public void tampilkanKHS() {
        System.out.println("\nTampilan KHS : ");
        System.out.println("  Nama Mahasiswa\t: " + mahasiswa.getNama());
        System.out.println("  Semester\t\t: "+getSemester());
        System.out.println("  IPK\t\t\t: "+getIPK());
        System.out.println("  Total SKS\t\t: "+totalSKS());
        System.out.println("Nilai");
        System.out.println("No.\t\t Kode Matakuliah\t Nama Matakuliah\t\t SKS\t\t Nilai");
        int count = 1;
        for(NilaiStudi i : listNilaiStudi){
            System.out.print(count+"\t\t ");
            System.out.print(i.getMataKuliah().getKodeMataKuliah()+"\t\t\t ");
            System.out.print(i.getMataKuliah().getNamaMataKuliah()+"\t\t ");
            System.out.print(i.getMataKuliah().getSKS()+"\t\t ");
            System.out.print(i.getNilaiHuruf());
            System.out.println();
            count++;
        }
    }

    public void tambahkanNilai (MataKuliah mataKuliah, char NilaiHuruf){
        listNilaiStudi.add(new NilaiStudi(mataKuliah, NilaiHuruf));
    }
}
