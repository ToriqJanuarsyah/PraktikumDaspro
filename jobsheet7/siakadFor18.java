
import java.util.Scanner;

public class siakadFor18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        
         System.out.println("Nilai Tertinggi : " + tertinggi);
         System.out.println("Nilai Terendah : " + terendah);
    }
}
