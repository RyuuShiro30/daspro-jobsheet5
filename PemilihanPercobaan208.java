import java.util.Scanner;

public class PemilihanPercobaan208 {

    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        float uas;
        uas = input08.nextFloat();
        float uts;
        uts = input08.nextFloat();
        float tugas;
        tugas = input08.nextFloat();
        float kuis;
        kuis = input08.nextFloat();

        System.out.println("Nilai uas: " + uas);
        System.out.println("Nilai uts: " + uts);
        System.out.println("Nilai tugas: " + tugas);
        System.out.println("Nilai kuis: " + kuis);

        float total = (uas * 0.4F) + (uts * 0.3F) + (tugas * 0.1F) + (kuis * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir: " + total + "sehingga " + message);
    }
}
