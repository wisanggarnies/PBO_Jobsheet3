public class KipasAngin {
    private boolean putar = false;
    private int kecepatan;
    private boolean colokanOn = false;
    private String Merek;

    public void menyala() {
        colokanOn = true;
    }

    public void mati() {
        colokanOn = false;
    }

    public void tambahKecepatan() {
        if (colokanOn = false) {
            System.out.println ("Kabel belum di colokkan !");
        }else{
            kecepatan = kecepatan +1;
        }
    }

    public void kurangiKecepatan() {
        if (colokanOn = true){
            kecepatan = kecepatan -1;
        }else{
            System.out.println("Kabel belum di colokkan !");
        }
    }

    public void memutar() {
        if (colokanOn == true) {
            putar = true;
        }else{
            System.out.print("Maaf colokan kabel terlebih dahulu !");
        }
    }

    public void setMerek(String newMerek) {
        Merek = newMerek;
    }

    public void cetakStatus() {
        System.out.println("Merek : " + Merek);
        System.out.println("Kecepatan : " + kecepatan);
    }
}
