import java.util.Scanner;

public class Kafe18 {

    public static void menu(String namaPelanggan) {
        System.out.println("Selamat datang " + namaPelanggan + "!");
        System.out.println("===== Menu Resto Kafe =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - 18,000");
        System.out.println("==============================");
        System.out.println("Silahkan Pilih Menu Yang Anda Inginkan.");
    }

    public static int hitungTotalHarga18(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = hargaItems[pilihanMenu-1] * banyakItem;
            return totalHarga;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        menu("Budi");
        int totalHarga = 0;

        String lanjut = "ya";

        while (lanjut.equalsIgnoreCase("ya")) {
         System.out.print("\nMasukan nomor menu yang ingin anda pesan : ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukan Jumlah item yang ingin dipesan : ");
        int banyakItem = sc.nextInt();
        int hargaMenu =  hitungTotalHarga18(pilihanMenu, banyakItem);
        totalHarga += hargaMenu;
        sc.nextLine();
        System.out.print("Apakah ada pesanan lain? (ya/tidak) : ");
        lanjut = sc.nextLine();
        }

        System.out.print("Masukan kode promo anda : ");
        String kodePromo = sc.nextLine();
        if (kodePromo.equals("DISKON50")) {
            System.out.println("SELAMAT, Anda mendapatkan diskon 50%.");
            totalHarga = totalHarga * 50/100;
        } else if ( kodePromo.equals("DISKON30")) {
            System.out.println("SELAMAT, Anda mendapatkan diskon 30%.");
            totalHarga = totalHarga * 70/100;
        } else {
            System.out.println("Kode yang dimasukan Invalid.");
        }
        System.out.println("Total harga untuk pesanan anda adalah : Rp." + totalHarga);
    }
}