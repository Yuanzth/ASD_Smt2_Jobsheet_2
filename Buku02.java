public class Buku02 {
    String judul, pengarang;
    int halaman, stok, harga;
    
    void tampilanInformasi(){
        System.out.println("Judul: "+judul);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Jumlah halaman: "+halaman);
        System.out.println("Sisa stok: "+ stok);
        System.out.println("Harga: Rp "+harga);
    }
    void terjual(int jml){
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Stok habis, tidak dapat menjual.");
        }
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }
    int hitungHargaTotal(int jumlahTerjual) {
        return harga * jumlahTerjual;
    }
    int hitungDiskon(int hargaTotal) {
        int diskon = 0;

        if (hargaTotal > 150000) {
            diskon = (int)(hargaTotal * 0.12); // Diskon 12%
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = (int)(hargaTotal * 0.05); // Diskon 5%
        }
        // Jika harga total kurang dari 75000, diskon tetap 0%

        return diskon;
    }
    int hitungHargaBayar(int hargaTotal, int diskon) {
        return hargaTotal - (hargaTotal * diskon);
    }
        
    public Buku02(){
    }
    public Buku02(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}