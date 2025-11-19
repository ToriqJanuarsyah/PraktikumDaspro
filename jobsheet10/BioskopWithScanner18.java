import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukan nama : ");
            String nama = sc.nextLine();
            System.out.print("Masukan baris : ");
            int baris = sc.nextInt();
            System.out.print("Masukan kolom : ");
            int kolom = sc.nextInt();
            sc.nextLine();
            
            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n) : ");
            String next = sc.nextLine();

            if ( next.equalsIgnoreCase ("n")) { 
                break;
            }
        }
    }
}