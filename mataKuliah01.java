public class mataKuliah01 {
    String kodeMK, namaMK;
    int sks;

    mataKuliah01(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilMataKuliah() {
        System.out.printf("| %-8s | %-20s | %-3d |\n", kodeMK, namaMK, sks);
    }
}
