import java.util.Scanner;

public class PemilihanUsia08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // deklarasi
        int usia;
        String kategori;

        System.out.println("usia: ");
        usia = input.nextInt();

        // System.out.println("kategori: ");
        // kategori = input.nextLine().toLowerCase();

        if (usia > 0 && usia <= 12) {
            kategori = "anak";
        } else if (usia > 13 && usia <= 19) {
            kategori = "remaja";
        } else if (usia > 20 && usia <= 64) {
            kategori = "dewasa";
        } else {
            kategori = "lansia";

        }
        System.out.println("kategori usia anda: " + kategori);
    }
}
