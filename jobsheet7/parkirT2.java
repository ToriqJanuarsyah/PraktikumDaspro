import java.util.Scanner;

public class parkirT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        System.out.print("Masukkan Jenis Kendaraan Anda (1 = Mobil, 2 = Motor, 0 = Keluar) : ");
        jenis = input.nextInt();

        while (jenis != 0) {
            if (jenis == 1 || jenis == 2) {
                do {
                    System.out.print("\nMasukkan Durasi Parkir Kendaraan Anda (jam) : ");
                    durasi = input.nextInt();

                    if (durasi <= 0) {
                        System.out.println("\nDurasi Parkir Kendaraan Tidak Valid! Silakan Input Ulang Durasi Parkir Kendaraan Anda.\n");
                    }
                } while (durasi <= 0);

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) { 
                    total += durasi * 3000;
                } else if (jenis == 2) { 
                    total += durasi * 2000;
                }

            } else {
                System.out.println("\nJenis Kendaraan Tidak Valid!");
            }

            System.out.print("\nMasukkan Jenis Kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");
            jenis = input.nextInt();
        }

        System.out.println("\nTotal Biaya Parkir Adalah Rp " + total);

        input.close();
    }
}
