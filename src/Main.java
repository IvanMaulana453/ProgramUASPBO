import Hewan.Kambing;
import Kandang.KandangKambing;

public class Main {
    public static void main(String[] args) {
        // Membuat objek kambing dan kandang kambing
        KandangKambing kandang = new KandangKambing();
        Kambing kambing1 = new Kambing("Kambing A", 20.5, 50, 80);
        Kambing kambing2 = new Kambing("Kambing B", 25.3, 55, 90);

        // Menambahkan kambing ke kandang
        kandang.tambahKambing(kambing1);
        kandang.tambahKambing(kambing2);

        // Mencatat perkembangan kambing tiap bulan
        kandang.catatPerkembangan(1, 22.0, 52, 85);
        kandang.catatPerkembangan(2, 24.5, 54, 88);

        // Menampilkan informasi kandang
        kandang.displayInfoKandang();
    }
}
