import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mahasiswa01[] mhs = {
            new mahasiswa01("22001", "Ali Rahman", "Informatika"),
            new mahasiswa01("22002", "Budi Santoso", "Informatika"),
            new mahasiswa01("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };

        mataKuliah01[] mk = {
            new mataKuliah01("MK001", "Struktur Data", 3),
            new mataKuliah01("MK002", "Basis Data", 3),
            new mataKuliah01("MK003", "Desain Web", 3)
        };

    }
}
