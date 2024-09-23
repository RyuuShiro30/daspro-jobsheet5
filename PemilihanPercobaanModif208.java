import java.util.Scanner;

public class PemilihanPercobaanModif208 {

    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.println("nilai angka");

        double nilai = input08.nextDouble();
        String nilaiHuruf;
        double nilaiSetara;
        String kualifikasi;

        if (nilai > 80 && nilai <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat baik";
        } else if (nilai > 73 && nilai <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari baik";
        } else if (nilai > 65 && nilai <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (nilai > 60 && nilai <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari cukup";
        } else if (nilai > 50 && nilai <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "cukup";
        } else if (nilai > 39 && nilai <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";
        } else if (nilai <= 39) {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";

            System.out.println("Nilai huruf: " + nilaiHuruf);
            // nilaiHuruf = input08.next();
            System.out.println("Nilai setara: " + nilaiSetara);
            // nilaiSetara = input08.nextDouble();
            System.out.println("Kualifikasi: " + kualifikasi);
            // kualifikasi = input08.next();

            input08.close();
        }
    }
}
