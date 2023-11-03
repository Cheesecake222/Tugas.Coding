import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Masukkan sebuah bilangan bulat (atau 0 untuk keluar): ");
        number = scanner.nextInt();

        while (number != 0) {
            if (number > 0) {
                System.out.println("Bilangan positif.");
            } else if (number < 0) {
                System.out.println("Bilangan negatif.");
            } else {
                System.out.println("Anda memasukkan angka 0. Program berhenti.");
                break; // Tambahkan titik koma di sini
            }

            System.out.print("Masukkan sebuah bilangan bulat (atau 0 untuk keluar): ");
            number = scanner.nextInt();
        }

        System.out.println("Program selesai.");
        scanner.close();
    }
}