import edu.uph.SIAK.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa("Calvin", "01210112", false, "20TI2");
        Mahasiswa mhs2 = new Mahasiswa("Sri", "01210113", true, "20TI2");
        Mahasiswa mhs3 = new Mahasiswa("Elvia", "01210114", true, "20TI2");

        
        JadwalKuliah jadwalKuliah = new JadwalKuliah();
        Dosen dsn1 = new Dosen ("Ade","00012345",false);
        MataKuliah matkul = new MataKuliah("Pemrograman Berorientasi Objek");
        RuanganVirtual ruanganVirtual = new RuanganVirtual("Teams Meeting Room");
        Tanggal tanggal = new Tanggal("Thursday", "17 June 2021");
        jadwalKuliah.tambahMahasiswa(mhs1);
        jadwalKuliah.tambahMahasiswa(mhs2);
        jadwalKuliah.tambahMahasiswa(mhs3);
        jadwalKuliah.setDosen(dsn1);
        jadwalKuliah.setMataKuliah(matkul);
        jadwalKuliah.setRuanganVirtual(ruanganVirtual);
        jadwalKuliah.setTanggal(tanggal);
        jadwalKuliah.tampilkanJadwalKuliah();
    }
}
