import java.util.Scanner;

public class kopiSenja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Jumlah cabang kafe: ");
        int cabang = sc.nextInt();

        int totalPelanggan = 0;
        int totalItem = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        
        for (int c = 1; c <= cabang; c++) {
            System.out.println("\n--- Cabang " + c + " ---");
            System.out.print("Jumlah pelanggan: ");
            int pelanggan = sc.nextInt();

            int itemCabang = 0;

            for (int p = 1; p <= pelanggan; p++) {
                System.out.print("- Pelanggan " + p + " memesan berapa item? ");
                int item = sc.nextInt();
                itemCabang += item;
            }

            System.out.println("Cabang " + c + ":");
            System.out.println("- Pelanggan: " + pelanggan + " orang");
            System.out.println("- Item terjual: " + itemCabang);

            totalPelanggan += pelanggan;
            totalItem += itemCabang;
        }

        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem + " item");
    }
}