import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);    

        System.out.print("Masukan Jumlah Mahasiswa : ");
        int jmlSiswa = sc.nextInt();

        int nilai[] = new int[jmlSiswa];

        double totalLULUS = 0, TotalTdkLULUS = 0;
        int LULUS = 0, tdkLULUS = 0;
        
        for ( int i = 0; i < nilai.length; i++ ) {
            System.out.print("Masukan nilai mahasiswa ke-" + ( i + 1 ) + " : ");
            nilai[i] = sc.nextInt();

            if ( nilai[i] > 70 ) {
                totalLULUS += nilai[i];
                LULUS++;
            } else {
                TotalTdkLULUS += nilai[i];
                tdkLULUS++;
            } 
        }
        double rata2LULUS = totalLULUS / LULUS;
        double rata2TdkLULUS = TotalTdkLULUS / tdkLULUS;

        System.out.println("Rata-rata nilai lulus = " + rata2LULUS);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLULUS);
    }
}