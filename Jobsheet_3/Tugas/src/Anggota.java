public class Anggota {
    private String ktp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String ktp, String nama, int limitPinjaman){
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getLimitPinjaman() {
        return this.limitPinjaman;
    }

    public void setLimitPinjaman(int limitPinjaman) {
        this.limitPinjaman = limitPinjaman;
    }

    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public void pinjam(int jumlahPinjaman){
        if(jumlahPinjaman > this.limitPinjaman){
            System.out.println("Maaf, jumlah peminnjaman melebihi limit");
        }else{
            this.jumlahPinjaman = jumlahPinjaman;
        }
    }

    public void angsur(int jumlahAngsur){
        if(jumlahAngsur < (10/100 * jumlahPinjaman)){
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }else{
            jumlahPinjaman -= jumlahAngsur;
        }
    }
}
