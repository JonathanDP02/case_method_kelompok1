public class mahasiswa01 {
    String NIM, nama, prodi;

    mahasiswa01(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.printf("| %-10s | %-15s | %-25s |\n", NIM, nama, prodi);
    }
}
