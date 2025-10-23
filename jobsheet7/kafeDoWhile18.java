
import java.util.Scanner;

public class kafeDoWhile18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, harkop = 12_000, harteh = 7000, harot = 20_000, totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah Kopi : ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh : ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti : ");
            roti = sc.nextInt();
            totalHarga = (harkop * kopi) + (harteh * teh) + (harot * roti);
            System.out.println("Total yang harus dibayar : Rp " + totalHarga);
            sc.nextLine();

        } while (true);

        System.out.println("Semua transaksi selesai.");

    }
}
