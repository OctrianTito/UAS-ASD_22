import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Kendaraan[] kendaraanList = new Kendaraan[5];
        TransaksiPajak[] transaksiList = new TransaksiPajak[5];
        int kendaraan = 0;
        int transaksi = 0;

        Kendaraan kendaraan1 = new Kendaraan("S 4567 YV", "Basko", "Mobil", 1500, 2018, 4);
        Kendaraan kendaraan2 = new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        Kendaraan kendaraan3 = new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        Kendaraan kendaraan4 = new Kendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);

        kendaraanList[0] = kendaraan1;
        kendaraanList[1] = kendaraan2;
        kendaraanList[2] = kendaraan3;
        kendaraanList[3] = kendaraan4;

        TransaksiPajak transaksi1 = new TransaksiPajak(1, 500000, 0, 1, kendaraan1);
        TransaksiPajak transaksi2 = new TransaksiPajak(2, 150000, 0, 5, kendaraan2);
        TransaksiPajak transaksi3 = new TransaksiPajak(3, 2000000, 100000, 9, kendaraan3);
        TransaksiPajak transaksi4 = new TransaksiPajak(4, 2000000, 100000, 9, kendaraan4);

        transaksiList[0] = transaksi1;
        transaksiList[1] = transaksi2;
        transaksiList[2] = transaksi3;
        transaksiList[3] = transaksi4;

        System.out.println("Menu : ");
        int pilihan;
        do {
            System.out.println("1. Tampilkan Data Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi berdasar nama Pemilik");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan : ");
            pilihan = sc1.nextInt();
            switch (pilihan) {
                case 1:
                    for (int i = 0; i < kendaraanList.length; i++) {
                        System.out.println("+++++++++++++++++++++");
                        System.out.println("Daftar Kendaraan");
                        System.out.println("+++++++++++++++++++++");
                        if (kendaraanList[i] != null) {
                            kendaraanList[i].tampilKendaraan();
                        }
                    }
                    break;
                case 2:
                    // Meminta input nomor TNKB dan bulan bayar
                System.out.print("Masukkan Nomor TNKB: ");
                String nomorTNKB = sc1.next();
                System.out.print("Masukkan Bulan Bayar: ");
                int bulanBayar = sc1.nextInt();
                
                for (int i = 0; i < transaksiList.length; i++) {
                    if (transaksiList[i] != null) {
                        TransaksiPajak t = transaksiList[i];
                        System.out.println("Kode: " + t.kode);
                        System.out.println("Nomor TNKB: " + t.kendaraan.noTNKB);
                        System.out.println("Nama: " + kendaraanList[1].nama);
                        System.out.println("Nominal: " + t.nominalBayar);
                        System.out.println("Denda: " + t.denda);
                        System.out.println("===============================");
                    }
                    break;
                case 3:
                System.out.println("+++++++++++++++++++++++++++++++++++");
                System.out.println("Daftar Transaksi Kendaraan Pajak :");
                System.out.println("+++++++++++++++++++++++++++++++++++");
                    System.out.println("Daftar Transaksi Pembayaran Pajak : ");
                    for (int i = 0; i < transaksiList.length; i++) {
                            if (transaksiList[i] != null){
                            System.out.println("Kode " + transaksiList[i].kode);
                            System.out.println("Nominal Bayar : " + transaksiList[i].nominalBayar);
                            System.out.println("Denda : " + transaksiList[i].denda);
                            System.out.println("=================================");
                            }
                    }

                default:
                    break;
            }
        } while (pilihan != 0);

    }
}