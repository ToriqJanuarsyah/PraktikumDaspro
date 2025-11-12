import java.util.Scanner;

public class SearchNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan banyaknya nilai yang akan diinput : ");
        int bykNilai = sc.nextInt();
        int[] arrNilai = new int[bykNilai];

        for ( int i = 0; i < arrNilai.length; i++ ) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukan nilai yang ingin dicari : ");
        int key = sc.nextInt();

        int hasil = -1;

        for ( int i = 0; i < arrNilai.length; i++ ) {
            if ( key == arrNilai[i] ) {
                hasil = i;
                break;
            } 
        }
        if ( hasil != -1 ) {
        System.out.println("\nNilai " + key + " ketemmu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("\nNilai yang dicari tidak ditemukan");
        }
    }
}