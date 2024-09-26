import java.util.Scanner;

public class SistemParkir08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // deklarasi
        String jeniskendaraan;
        int durasiparkir;
        int biayaparkir = 0;

        System.out.println("jenis kendaraan (mobil/motor): ");
        jeniskendaraan = input.nextLine().toLowerCase();

        System.out.println("durasi parkir: ");
        durasiparkir = input.nextInt();

        System.out.println("biaya parkir: ");
        biayaparkir = input.nextInt();

        if (jeniskendaraan.equals("mobil")) {
            biayaparkir = 5000 * durasiparkir;
        } else if (jeniskendaraan.equals("motor")) {
            biayaparkir = 3000 * durasiparkir;

        }
        System.out.println("biaya yang harus dibayar: " + biayaparkir);
    }
}