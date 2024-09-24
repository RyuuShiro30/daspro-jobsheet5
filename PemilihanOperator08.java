import java.util.Scanner;

public class PemilihanOperator08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka1;
        int angka2;
        char operator;
        double hasil;

        System.out.println("angka 1: ");
        angka1 = input.nextInt();

        System.out.println("angka 2: ");
        angka2 = input.nextInt();

        System.out.println("operator: ('+'. '-', '/', '*')");
        operator = input.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println("hasil: " + hasil);
        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '/') {
            hasil = angka1 / angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println("Hasil: " + hasil);
        } else {
            System.out.println("operasi yang dipilih tidak sesuai");
        }
    }
}
