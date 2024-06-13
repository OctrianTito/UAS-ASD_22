/**
 * Kendaraan
 */
public class Kendaraan {
    String noTNKB;
    String nama;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;

    public Kendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }

    void tampilKendaraan() {
        System.out.println("Nomor TNKB : " + noTNKB);
        System.out.println("Nama Pemilik = " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("cc : " + cc);
        System.out.println("Tahun : " + tahun);
        System.out.println("Bulan harus bayar : " + bulanHarusBayar);
    }
}