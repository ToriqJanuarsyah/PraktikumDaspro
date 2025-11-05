import java.util.Scanner;

public class NilaiKelompok18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai;
        float totalNilai;
        float rataNilai;
        int kelompokTerbaik = 0;
        float rataTinggi = 0;

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + " : nilai rata-rata = " + rataNilai);

            if (rataNilai > rataTinggi ) {
                rataTinggi = rataNilai;
                kelompokTerbaik = i;
            }
            i++;
        }
        System.out.println("\n Kelompok dengan rata-rata nilai tertinggi adalah kelompok " + kelompokTerbaik);
    }
}