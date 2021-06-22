import edu.uph.SIAK.model.*;
import java.util.Scanner;

/*
    Nama : Richard Hanitio
    NIM : 03082200014
*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int input;
        char confirm;

        Mahasiswa mhs = new Mahasiswa("Richard Hanitio");
        MataKuliah mk1 = new MataKuliah("MK001", "Object Oriented", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Bahasa Indonesia", 2);
        MataKuliah mk3 = new MataKuliah("MK003", "Wawasan Dunia II", 4);

        KartuHasilStudi khs = new KartuHasilStudi(3, mhs);
        khs.tambahkanNilai(mk1, 'A');
        khs.tambahkanNilai(mk2, 'A');
        khs.tambahkanNilai(mk3, 'A');

        do {
            System.out.println("Menu");
            System.out.println("==================");
            System.out.println("1. Tampilkan KHS");
            System.out.println("2. Keluar");
            System.out.print("Anda memilih : ");
            input = scanner.nextInt();
            
            switch (input) {
                case 1 :
                    khs.tampilkanKHS();
                    break;
                
                case 2 :
                    System.out.println("Terima kasih...");
                    System.exit(0);

                default :
                    System.out.println("Masukkan angka yang benar...");
            }

            System.out.print("\nUlangi (y/n)? ");
            scanner.nextLine();
            String yesno = scanner.nextLine();
            confirm = yesno.charAt(0);
            System.out.println();

        } while (confirm == 'y' || confirm == 'Y');
        
        System.out.println("Terima Kasih...");
        scanner.close();
    }
}
