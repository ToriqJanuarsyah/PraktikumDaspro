import java.util.Scanner;

public class RekapPenjualanCafe18 {
    static Scanner sc = new Scanner(System.in);    

    public static void inputData (int[][] dataPenjualan, String[] namaMenu, int jmlhHari) {
        System.out.println("\n===== INPUT DATA PENJUALAN=====");
        sc.nextLine();
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.print("Masukan nama menu ke-" + (i+1) + " : ");
            namaMenu[i] = sc.nextLine();
        }

        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.println("\nInput data penjualan untuk menu " + namaMenu[i]);
            for (int j = 0; j < jmlhHari; j++ ) {
                System.out.print("Hari ke-" + (j+1) + " : ");
                dataPenjualan[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilData(int[][] dataPenjualan, String[] namaMenu, int jmlhHari) {
    System.out.println("\n===== REKAP DATA PENJUALAN =====");

    System.out.printf("%-20s", "Menu"); 
    
    for (int i = 0; i < jmlhHari; i++) {
        System.out.printf("%-10s", "Hari ke-" + (i + 1));
    }
    System.out.println(); 

    for (int i = 0; i < dataPenjualan.length; i++) {
        System.out.printf("%-20s", namaMenu[i]);
        
        for (int j = 0; j < jmlhHari; j++) {
            System.out.printf("%-10d", dataPenjualan[i][j]);
        }
        System.out.println(); 
    }
} 

    public static void PenjualanTertinggi (int[][] dataPenjualan, String[] namaMenu, int jmlhHari) {
        System.out.println("\n===== MENU TERLARIS =====");
        int Terlaris = 0;
        int indexTerlaris = 0;

        for ( int i = 0; i < dataPenjualan.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < jmlhHari; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }

            if ( totalPerMenu > Terlaris ) {
            Terlaris = totalPerMenu;
            indexTerlaris = i;
            }   
        }
        System.out.println("Menu Terlaris adalah : " + namaMenu[indexTerlaris]);
        System.out.println("Dengan total penjualan sebanyak : " + Terlaris);
    }

    public static void rataPenjualan (int[][] dataPenjualan, String[] namaMenu, int jmlhHari) {
        System.out.println("\n===== RATA-RATA PENJUALAN TIAP MENU =====");
        for ( int i = 0; i < dataPenjualan.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < jmlhHari; j++) {
              totalPerMenu += dataPenjualan[i][j];
            }
        double rata2 = totalPerMenu / jmlhHari;
        System.out.println("menu " + namaMenu[i] + " : " + rata2);
        }    
    }

    public static void main(String[] args) {
        System.out.print("masukan jumlah menu : ");
        int jmlhMenu = sc.nextInt();
        System.out.print("masukan jumlah hari penjualan : ");
        int jmlhHari = sc.nextInt();
        String[] namaMenu = new String[jmlhMenu];
        int[][] dataPenjualan = new int[jmlhMenu][jmlhHari];

        inputData(dataPenjualan, namaMenu, jmlhHari);
        tampilData(dataPenjualan, namaMenu, jmlhHari);
        PenjualanTertinggi(dataPenjualan, namaMenu, jmlhHari);
        rataPenjualan(dataPenjualan, namaMenu, jmlhHari);
    }
}
