package UAS;

public class Makanan extends Barang {
    
    String tgl_exp;
    
    Makanan(String nama,String harga,String stok,String tgl_masuk,String tgl_exp)
    {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.tgl_masuk = tgl_masuk;
        this.tgl_exp = tgl_exp;
    }
}