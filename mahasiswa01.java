public class mahasiswa01 {
    String NIM, nama, prodi;

    mahasiswa01(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.println("NIM: " + NIM + ", " + "Nama: " + nama + ", " + "Prodi: " + prodi);
    }
}