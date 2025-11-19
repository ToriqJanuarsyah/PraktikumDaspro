import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];

       int menu;

       while (true) {
        System.out.println("\n === MENU === " );
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih menu :");
        menu = sc.nextInt();
        sc.nextLine();
    
        switch (menu) {
            case 1 :
                while (true) {
                    System.out.print("\nMasukan nama : ");
                    String nama = sc.nextLine();

                    while (true) {
                    System.out.print("Masukan baris :");
                    int baris = sc.nextInt();
                    System.out.print("Masukan kolom : ");
                    int kolom = sc.nextInt();
                    sc.nextLine();
                    
                    if (baris < 1 || baris > 4 || kolom < 1 && kolom > 2) {
                        System.out.println("invalid! Baris atau kolom tidak tersedia");
                    } else if ( penonton[baris-1][kolom-1] != null) {
                        System.out.println("Maaf, kursi sudah terisi orang lain!");
                        System.out.println("Silahkan pilih kursi lain.");
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data berhasil disimpan.");
                        break;
                    }
                }
                   
                    System.out.print("input data penonton lainnya? (y/n) :");
                    String next = sc.nextLine();
                    if ( next.equalsIgnoreCase("n")) {
                        break;
                    } 
                }
                break;

            case 2 :
                System.out.println("=== Daftar Penonton ===");
                for (int i = 0; i < penonton.length; i++)  {
                    System.out.print("baris ke=" + (i+1) + " : ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
                break;

            case 3 :
                System.out.println("Selesai");
                System.exit(0);
                break;
                
            default:
                    System.out.println("Menu tidak valid!");
        }
      }
    }
}