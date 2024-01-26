package Kandang;

import Hewan.Kambing;
import Perkembangan.PerkembanganKambing;

import java.util.ArrayList;

public class KandangKambing {
    private ArrayList<Kambing> kambingList;
    private ArrayList<PerkembanganKambing> perkembanganList;

    // Constructor untuk inisialisasi kandang kambing
    public KandangKambing() {
        kambingList = new ArrayList<>();
        perkembanganList = new ArrayList<>();
    }

    // Method untuk menambahkan kambing ke kandang
    public void tambahKambing(Kambing kambing) {
        kambingList.add(kambing);
    }

    // Method untuk mencatat perkembangan kambing tiap bulan
    public void catatPerkembangan(int bulan, double berat, double tinggi, double panjang) {
        PerkembanganKambing perkembangan = new PerkembanganKambing(bulan, berat, tinggi, panjang);
        perkembanganList.add(perkembangan);
    }

    // Method untuk menampilkan informasi kandang
    public void displayInfoKandang() {
        for (Kambing kambing : kambingList) {
            kambing.displayInfo();
            System.out.println("Perkembangan Tiap Bulan:");
            for (PerkembanganKambing perkembangan : perkembanganList) {
                if (perkembangan.getBulan() == 0) {
                    System.out.println("  Belum ada perkembangan.");
                } else {
                    System.out.println("  Bulan " + perkembangan.getBulan() + ":");
                    System.out.println("    Berat: " + perkembangan.getBerat() + " kg");
                    System.out.println("    Tinggi: " + perkembangan.getTinggi() + " cm");
                    System.out.println("    Panjang: " + perkembangan.getPanjang() + " cm");
                }
            }
            System.out.println();
        }
    }
}
