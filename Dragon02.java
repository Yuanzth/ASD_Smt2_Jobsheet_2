public class Dragon02 {
    int x, y, width, height;

    // Fungsi untuk menggerakkan dragon ke kiri
    void moveLeft() {
        x--;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }
    // Fungsi untuk menggerakkan dragon ke kanan
    void moveRight() {
        x++;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }
    // Fungsi untuk menggerakkan dragon ke atas
    void moveUp() {
        y--;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }
    // Fungsi untuk menggerakkan dragon ke bawah
    void moveDown() {
        y++;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }
    // Fungsi untuk mencetak posisi dragon
    void printPosition() {
        System.out.println("Position: (" + x + ", " + y + ")");
    }
    // Fungsi untuk mendeteksi tabrakan dengan batas area permainan
    void detectCollision() {
        System.out.println("Game Over");
    }
}
