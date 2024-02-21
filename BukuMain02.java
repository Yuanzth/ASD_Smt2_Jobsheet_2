public class BukuMain02 {
    public static void main(String[] args) {
        Buku02 bk1 = new Buku02();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilanInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilanInformasi();

        Buku02 bk2 = new Buku02("Self Reward",
        "Maheera Ayesha",160,29,59000);
        bk2.terjual(11);
        bk2.tampilanInformasi();
        
        Buku02 bukuAdityaYuhandaPutra = new Buku02(
            "Sesuatu di Jogja","Mahendra",56,12,50000);

    }
}
