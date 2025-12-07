public class PengunjungCafe18 {
    static void daftarPengunjung (String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung : ");
        for (String nama : namaPengunjung) {
        System.out.println("- " + nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung();
    }
}