import java.util.Scanner;

public class penjualanTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, totalTiket = 0;
        int totalPenjualan = 0;
        String lanjutkan = "ya";

        while (lanjutkan.equalsIgnoreCase("ya")) {
            System.out.print("\nMasukan Jumlah Tiket : ");
            int jmlTiket = sc.nextInt();

            if (jmlTiket < 1 ) {
                System.out.println("Jumlah Tiket Tidak Valid. Masukan Ulang Jumlah Tiket!");
                continue;
            }

            double diskon = 0;

            if (jmlTiket > 10 ) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10;
            }

            int totalHarga = jmlTiket * hargaTiket;
            double potongan = totalHarga * diskon;
            double dibayar = totalHarga - potongan;

            totalTiket += jmlTiket;
            totalPenjualan += dibayar; 
            
            System.out.println("------------------------------------------------");
            System.out.println("Total Harga Awal : Rp " + totalHarga);
            System.out.println("Diskon : " + (diskon * 100) + "%");
            System.out.println("Total Harga akhir : " + dibayar);
            System.out.println("------------------------------------------------");

            System.out.print("Lanjut Pelanggan Berikutnya? (ya/tidak) ");
            lanjutkan = sc.next();
        }

System.out.println("\n ========== LAPORAN PENJUALAN HARI INI ==========");
System.out.println("Total Tiket Yang Terjual : " + totalTiket + " Tiket");
System.out.println("Total Harga Penjualan : Rp " + totalPenjualan);
        
        sc.close();
        
    }
}
