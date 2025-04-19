public class sortAndSearch01 {
    public static void sortNilaiDescending(penilaian01[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].nilaiAkhir < data[j + 1].nilaiAkhir) {
                    penilaian01 temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
    
    public static void cariByNIM(penilaian01[] data, String nim) {
        boolean kondisi = false;
        for (penilaian01 p : data) {
            if (p.mahasiswa.NIM.equalsIgnoreCase(nim)) {
                p.tampilNilai();
                kondisi = true;
            }
        }
        if (!kondisi) {
            System.out.println("Data dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public static void cariByNama(penilaian01[] data, String nama) {
        boolean kondisi = false;
        for (penilaian01 p : data) {
            if (p.mahasiswa.nama.equalsIgnoreCase(nama)) {
                p.tampilNilai();
                kondisi = true;
            }
        }

        if (!kondisi) {
            System.out.println("Data dengan nama \"" + nama + "\" tidak ditemukan.");
        }
    }
}
