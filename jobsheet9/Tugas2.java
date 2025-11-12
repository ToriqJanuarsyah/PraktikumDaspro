import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        System.out.print("Masukkan jumlah pesanan yang akan diinput : ");
        int jmlh = sc.nextInt();
        sc.nextLine();
        int[] hargaPesanan = new int[jmlh];
        String[] namaPesanan = new String[jmlh]; 
        
        int totalBiaya = 0;

        for ( int i =0; i < namaPesanan.length; i++) {
            System.out.println("\n----- Pesanan ke-" + (i + 1) + " -----");
            System.out.print("Masukkan Nama Pesanan : ");
            namaPesanan[i] = sc.nextLine();
            
            System.out.print("Masukkan Harga Pesanan : ");
            hargaPesanan[i] = sc.nextInt();
            totalBiaya += hargaPesanan[i];
             sc.nextLine();
        }
        System.out.println("\n==============================================");
        System.out.println("          DAFTAR PESANAN ANDA          ");
        System.out.println("==============================================");

        for (int i = 0; i < namaPesanan.length; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " ( Rp" + hargaPesanan[i] + " )");
        }
        System.out.println("----------------------------------------------");
        System.out.println("TOTAL BIAYA KESELURUHAN: Rp" + totalBiaya);
        System.out.println("==============================================");
    }
}
