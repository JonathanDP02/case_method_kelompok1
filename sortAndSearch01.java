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
}
