package Perkembangan;

public class PerkembanganKambing {
    private int bulan;
    private double berat;
    private double tinggi;
    private double panjang;

    // Constructor data perkembangan kambing tiap bulan
    public PerkembanganKambing(int bulan, double berat, double tinggi, double panjang) {
        this.bulan = bulan;
        this.berat = berat;
        this.tinggi = tinggi;
        this.panjang = panjang;
    }

    public int getBulan() {
        return bulan;
    }

    public double getBerat() {
        return berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getPanjang() {
        return panjang;
    }
}
