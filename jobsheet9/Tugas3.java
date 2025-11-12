import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                        "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari : ");
        String pesanan = sc.nextLine();

        int ketersediaan = -1;

        for ( int i = 0; i < menu.length; i++) {
            if ( pesanan.equalsIgnoreCase(menu[i])) {
                ketersediaan = i;
                break;
            }
        }
        System.out.println("----------------------------------------------");
        if (ketersediaan != -1) {
            System.out.println("Menu " + pesanan + " tersedia.");
        } else {
            System.out.println("Mohon maaf, makanan " + pesanan + " tidak tersedia pada menu.");
        }
        System.out.println("==============================================");
    }
}
