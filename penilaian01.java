public class penilaian01 {
    mahasiswa01 mahasiswa;
    mataKuliah01 matkul;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    penilaian01(mahasiswa01 mhs, mataKuliah01 mk, int tugas, int uts, int uas) {
        mahasiswa = mhs;
        matkul = mk;
        nilaiTugas = tugas;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }
    
    void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }
    
    void tampilNilai() {
        hitungNilaiAkhir();
        System.out.printf("| %-15s | %-15s | %-12.2f |\n", mahasiswa.nama, matkul.namaMK, nilaiAkhir);
    }
}
