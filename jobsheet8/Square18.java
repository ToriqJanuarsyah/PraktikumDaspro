import java.util.Scanner;

public class Square18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai n : ");
        int n = sc.nextInt();

        for (int iouter = 1; iouter <= n; iouter++ ) {
            for ( int i = 1; i <= n; i++) {
            System.out.print("*");
            }
        }
    }
    
}
