import java.util.Scanner;

public class PemilihanPercobaan108 {

    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        // deklarasi
        int angka;

        System.out.println("angka: ");
        angka = input00.nextInt();

        if (angka % 2 == 0)
            System.out.println("angka" + angka + "bilangan genap");
        else
            System.out.println("angka " + angka + "bilangan ganjil");

    }
}