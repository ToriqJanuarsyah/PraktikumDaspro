import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] survey = new double[10][6];

        System.out.println("=== DATA SURVEY KEPUASAN PELANGGAN SKALA (1-5) ===");
        for ( int i = 0; i < 10; i++ ) {
            System.out.println("\nResponden pelanggan ke-" + (i+1) + " : ");
            for (int j = 0; j < 6; j++ ) {
                System.out.print("Nilai kepuasan pada pertanyaan ke-" + (j+1) + " : ");
                survey[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\n=== RATA-RATA TIAP RESPONDEN ===");
        for (int i = 0; i < 10; i++) {
            double totalPerResp = 0;
            for (int j = 0; j < 6; j++) {
                totalPerResp += survey[i][j];
            }
        System.out.printf("Responden %d : %.2f\n",  (i + 1), (totalPerResp / 6));
        }
        System.out.println("\n=== RATA-RATA TIAP PERTANYAAN ===");
        for ( int j = 0; j < 6; j++ ) {
            double totalPerPert = 0;
            for (int i = 0; i < 10; i++) {
                totalPerPert += survey[i][j];
            }
        System.out.printf("pertanyaan ke-%d : %.2f\n", (j+1), totalPerPert);
        }
        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        double KESELURUHAN = 0;
        for (int i = 0; i < 10; i++) {
            for ( int j = 0; j < 6; j++ ) {
                KESELURUHAN += survey[i][j]; 
            }
        }
        System.out.printf("Rata-rata Keseluruhan Survey Kepuasan pelangan adalah %.2f", (KESELURUHAN / 60));
    }
}
