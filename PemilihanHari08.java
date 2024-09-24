import java.util.Scanner;

public class PemilihanHari08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nomorHari;

        System.out.println("masukkan nomor hari 1-7");
        nomorHari = input.nextInt();

        switch (nomorHari) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("nomor yang dimasukkan tidak valid");
                break;
        }
    }
}
