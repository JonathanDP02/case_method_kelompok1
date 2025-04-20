import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Data Mahasiswa
        mahasiswa01[] mhs = {
            new mahasiswa01("22001", "Ali Rahman", "Informatika"),
            new mahasiswa01("22002", "Budi Santoso", "Informatika"),
            new mahasiswa01("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };

        //Data Mata Kuliah
        mataKuliah01[] mk = {
            new mataKuliah01("MK001", "Struktur Data", 3),
            new mataKuliah01("MK002", "Basis Data", 3),
            new mataKuliah01("MK003", "Desain Web", 3)
        };

        //Data Penilaian
        penilaian01[] nilai = {
            new penilaian01(mhs[0], mk[0], 80, 85, 90),
            new penilaian01(mhs[0], mk[1], 60, 75, 70),
            new penilaian01(mhs[1], mk[0], 75, 70, 80),
            new penilaian01(mhs[2], mk[1], 85, 90, 95),
            new penilaian01(mhs[2], mk[2], 80, 90, 65)
        };

        int pilihan;

        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Nilai Mahasiswa");
            System.out.println("4. Urutkan Nilai Akhir (Descending)");
            System.out.println("5. Cari Mahasiswa berdasarkan NIM");
            System.out.println("6. Cari Mahasiswa berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa: ");
                    for (mahasiswa01 m : mhs) {
                        m.tampilMahasiswa();
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Mata Kuliah: ");
                    for (mataKuliah01 m : mk) {
                        m.tampilMataKuliah();
                    }
                    break;

                case 3:
                    System.out.println("\nData Penilaian: ");
                    for (penilaian01 p : nilai) {
                        p.tampilNilai();
                    }
                    break;

                case 4:
                    System.out.println("\nNilai Setelah Diurutkan: ");
                    sortAndSearch01.sortNilaiDescending(nilai);
                    for (penilaian01 p : nilai) {
                        p.tampilNilai();
                    }
                    break;

                case 5:
                    System.out.print("\nMasukkan NIM yang dicari: ");
                    String cariNIM = sc.nextLine();
                    sortAndSearch01.cariByNIM(nilai, cariNIM);
                    break;

                case 6:
                    System.out.print("\nMasukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    sortAndSearch01.cariByNama(nilai, cariNama);
                    break;

                case 0:
                    System.out.println("\nTerima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid!");
            }

        } while (pilihan != 0);

        sc.close();
    }
}