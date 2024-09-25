import java.util.Scanner;

public class Kafe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variabel
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi, hargaTeh, hargaRoti, totalHarga, nominalBayar;
        float diskon = 0;
        boolean keanggotaan;

        // Input jumlah dan harga produk
        System.out.print("Masukkan jumlah kopi: ");
        jmlKopi = scanner.nextInt();
        System.out.print("Masukkan harga kopi: ");
        hargaKopi = scanner.nextDouble();

        System.out.print("Masukkan jumlah teh: ");
        jmlTeh = scanner.nextInt();
        System.out.print("Masukkan harga teh: ");
        hargaTeh = scanner.nextDouble();

        System.out.print("Masukkan jumlah roti: ");
        jmlRoti = scanner.nextInt();
        System.out.print("Masukkan harga roti: ");
        hargaRoti = scanner.nextDouble();

        // Input status keanggotaan
        System.out.print("Apakah Anda member kafe? (true/false): ");
        keanggotaan = scanner.nextBoolean();

        // Hitung total harga tanpa diskon
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        // Cek keanggotaan untuk memberikan diskon
        if (keanggotaan) {
            diskon = 0.1f; // Diskon 10% untuk member
            System.out.println("Anda mendapatkan diskon 10%.");
        } else {
            System.out.println("Anda bukan member, tidak ada diskon.");
        }

        // Hitung total harga setelah diskon
        nominalBayar = totalHarga - (totalHarga * diskon);

        // Tampilkan hasil
        System.out.printf("Total harga sebelum diskon: Rp%.2f\n", totalHarga);
        System.out.printf("Total harga setelah diskon: Rp%.2f\n", nominalBayar);

        scanner.close();
    }
}
