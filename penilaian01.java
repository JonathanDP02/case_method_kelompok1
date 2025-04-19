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
        System.out.println(mahasiswa.nama + ", " + matkul.namaMK + ", " + "Nilai Akhir: " + nilaiAkhir );
    }
