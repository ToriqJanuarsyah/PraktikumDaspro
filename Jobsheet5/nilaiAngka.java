
import java.util.Scanner;

public class nilaiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("masukan angka : ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("angka bernilai Genap");
        }
        else {
            System.out.println("Angka bernilai ganjil");
        }

    }
}
