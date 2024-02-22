import java.util.Scanner;

public class DragonMain02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input untuk lebar (width) dan tinggi (height) area permainan
        System.out.print("Masukkan lebar area permainan: ");
        int width = scanner.nextInt();
        System.out.print("Masukkan tinggi area permainan: ");
        int height = scanner.nextInt();

        // Membuat objek Dragon
        Dragon02 dragon = new Dragon02();
        dragon.width = width;
        dragon.height = height;
        dragon.x = width / 2; // Mengatur posisi awal dragon di tengah area permainan
        dragon.y = height / 2;

        // Loop utama untuk menggerakkan dragon hingga terjadi tabrakan
        while (true) {
            // Mencetak posisi dragon saat ini
            System.out.println("\nPosisi dragon:");
            dragon.printPosition();

            // Meminta input gerakan dari pengguna
            System.out.print("Masukkan kontrol (W/A/S/D untuk gerak, Q untuk keluar): ");
            String control = scanner.next();

            // Memproses input gerakan
            switch (control.toLowerCase()) {
                case "w":
                    dragon.moveUp();
                    break;
                case "a":
                    dragon.moveLeft();
                    break;
                case "s":
                    dragon.moveDown();
                    break;
                case "d":
                    dragon.moveRight();
                    break;
                case "q":
                    System.out.println("Permainan berakhir.");
                    return;
                default:
                    System.out.println("Masukan kontrol tidak valid!");
            }

            // Memeriksa apakah dragon menabrak batas area permainan
            if (dragon.x < 0 || dragon.x >= width || dragon.y < 0 || dragon.y >= height) {
                System.out.println("Dragon menabrak batas area permainan.");
                break;
            }
        }

        scanner.close();
    }
}
