import java.util.Scanner;

public class Siakad08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data siswa
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();

        System.out.print("Masukkan Nomor Absen: ");
        int noAbsen = scanner.nextInt();

        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = scanner.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai Ujian: ");
        double nilaiUjian = scanner.nextDouble();

        // Menghitung nilai akhir
        double nilaiAkhir = (0.2 * nilaiKuis) + (0.3 * nilaiTugas) + (0.5 * nilaiUjian);

        // Menentukan nilai huruf
        String nilaiHuruf;
        nilaiHuruf = "";
        String kualifikasi;
        kualifikasi = "";

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "lebih dari cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";

        }

        // Output data siswa dan nilai
        System.out.println("\n--- Data Siswa ---");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nomor Absen: " + noAbsen);
        System.out.println("Nilai Kuis: " + nilaiKuis);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai Ujian: " + nilaiUjian);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}
