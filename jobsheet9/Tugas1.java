import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa yang nilainya akan diinput: ");
        int jmlMhs = sc.nextInt();

        int[] nilai = new int[jmlMhs];

        int total = 0;
        int nilaiTertinggi = 0; 
        int nilaiTerendah = 100;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : "); 
            nilai[i] = sc.nextInt();
            total += nilai[i];

            if ( nilai[i] > nilaiTertinggi ) {
                nilaiTertinggi = nilai[i];
            } 
            if ( nilai[i] < nilaiTerendah ) {
                nilaiTerendah = nilai[i];
            }   
        }
        double rataRata = (double) total / nilai.length;
        
        System.out.println("\n==============================================");
        System.out.println("          REKAPITULASI NILAI MAHASISWA          ");
        System.out.println("==============================================");

        System.out.print("Daftar Nilai yang diinput: [");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]);
            if (i < nilai.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("----------------------------------------------");
        System.out.println("Nilai Rata-Rata Kelas : " + rataRata);
        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah : " + nilaiTerendah);
        System.out.println("==============================================");
    }
}
