import java.util.Scanner;

public class PemilihanPercobaan308 {

    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int angka1;
        int angka2;
        double hasil;
        char operator;

        System.out.println("Angka 1: ");
        angka1 = input08.nextInt();

        System.out.println("Angka 2: ");
        angka2 = input08.nextInt();

        System.out.println("Operasi: ('+', '-', '/', '*')");
        operator = input08.next().charAt(0);

        // switch
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;

            default:
                System.out.println("operasi tidak valid");
                break;
        }

    }
}