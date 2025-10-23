
import java.util.Scanner;

public class siakadFor18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();
            if (nilai >= 0 && nilai <= 100) {
                if (nilai > tertinggi) {
                    tertinggi = nilai;
                }
                if (nilai < terendah) {
                    terendah = nilai;
                }
            } 
            if (nilai >= 60 && nilai <= 100) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("Jumlah Mahasiswa LULUS : " + lulus);
        System.out.println("Jumlah Mahasiswa TIDAK LULUS : " + tidakLulus);
    }
}
