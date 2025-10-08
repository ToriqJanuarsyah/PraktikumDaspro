
import java.util.Scanner;

public class aksesWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah anda membawa Kartu Mahasiswa anda? (true/false)" );
        Boolean kartuMahsiswa = sc.nextBoolean();

        System.out.println("apakah anda sudah melakukan Registrasi Online? (true/false)");
        Boolean regOnline = sc.nextBoolean();

        if (kartuMahsiswa || regOnline) {
            System.out.println("Boleh masuk");
        }
        else {
            System.out.println("Maaf, tidak boleh masuk");
        }
        }
        
    }

