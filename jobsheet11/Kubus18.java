import java.util.Scanner;

public class Kubus18 {
    public static int hitungVolume (int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static int hitungLueasPermukaan (int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan panjang sisi kubus : ");
        int sisi = sc.nextInt();

        System.out.println("Volume kubus dengan panjang sisi " +sisi+ " cm adalah " + hitungVolume(sisi) + " cm^3");
        System.out.println("Luas permukaan kubus dengan pajang sisi " + sisi + " cm adalah " + hitungLueasPermukaan(sisi) + "cm^2");
    }
}