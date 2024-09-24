import java.util.Scanner;

public class PemilihanPercobaan108 {

    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        // deklarasi
        int angka;
        String hasil;

        System.out.println("angka: ");
        angka = input00.nextInt();

        hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";

        System.out.println(angka + "adalah" + hasil);
    }
}