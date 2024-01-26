package Hewan;

public class Kambing {
    private String nama;
    private double berat;
    private double tinggi;
    private double panjang;

    // Constructor untuk inisialisasi data kambing
    public Kambing(String nama, double berat, double tinggi, double panjang) {
        this.nama = nama;
        this.berat = berat;
        this.tinggi = tinggi;
        this.panjang = panjang;
    }
    // Method untuk menampilkan informasi kambing
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Panjang: " + panjang + " cm");
    }
}
