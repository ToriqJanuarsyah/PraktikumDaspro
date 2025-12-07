import java.util.Scanner;

public class NilaiMahasiswa18 {
    static Scanner sc = new Scanner(System.in);
     
    public static void isianArray (int[] nilai) {
        System.out.println("----- Input nilai mahasiswa ----- ");
        for (int i = 0; i < nilai.length; i ++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
        }
    }

    public static void tampilArray (int[] nilai) {
        System.out.println("\n===== DAFTAR NILAI MAHASISWA =====");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("nilai mahasiswa ke-" + (i + 1) + " : " + nilai[i]);
        }
    }

    public static int hitTot (int[] nilai) {
        int nilaiTotal = 0;
        for (int i = 0; i < nilai.length; i++) {
            nilaiTotal += nilai[i];
        }
        return  nilaiTotal;
    }

    public static void main(String[] args) {
        System.out.print("Masukan jumlah mahasiswa : ");
        int N = sc.nextInt();
        int nilai[] = new int[N];
        isianArray(nilai);
        tampilArray(nilai);
        hitTot(nilai);
        System.out.println("nilai Total seluruh mahasiswa adalah : " + hitTot(nilai));
    }
}
