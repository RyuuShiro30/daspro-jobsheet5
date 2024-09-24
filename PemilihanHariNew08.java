import java.util.Scanner;

public class PemilihanHariNew08 {

    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int nomorHari;

        System.out.println("Nomor hari: ");
        nomorHari = input08.nextInt();

        String namaHari = "";
        String tipeHari = "";

        if (nomorHari == 1) {
            namaHari = "Senin";
            tipeHari = "weekday";
        } else if (nomorHari == 2) {
            namaHari = "Selasa";
            tipeHari = "weekday";
        } else if (nomorHari == 3) {
            namaHari = "Rabu";
            tipeHari = "weekday";
        } else if (nomorHari == 4) {
            namaHari = "Kamis";
            tipeHari = "weekday";
        } else if (nomorHari == 5) {
            namaHari = "Jumat";
            tipeHari = "weekday";
        } else if (nomorHari == 6) {
            namaHari = "Sabtu";
            tipeHari = "weekend";
        } else if (nomorHari == 7) {
            namaHari = "Minggu";
            tipeHari = "weekend";
        } else {
            System.out.println("invalid number");
        }
        if (nomorHari >= 1 && nomorHari <= 7) {
            System.out.println("Hari: " + namaHari);
            System.out.println(tipeHari);
        }
    }
}