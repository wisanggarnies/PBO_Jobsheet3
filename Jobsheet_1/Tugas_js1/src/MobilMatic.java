public class MobilMatic {
    private boolean kontakOn = false;
    private int kecepatan ;
    String Merek ;


    public void nyalaMesin() {
        kontakOn = true;
    }

    public void matiMesin() {
        kontakOn = false;
    }

    public void tambahKecepatan() {
        if(kontakOn == false) {
            System.out.println("Harap nyalakan mesin terlebih dahulu !");
        }else{
            kecepatan = kecepatan +10;
        }
    }

    public void kurangiKeceptan() {
        if(kontakOn == true){
            kecepatan = kecepatan -10;
        }else{
            System.out.println("Harap nyalakan mesin terlebih dahulu !");
        }
    }

    public void cetakStatus() {
        System.out.println("Merek : " + Merek);
        System.out.println("Kecepatan : " + kecepatan);
    }

    public void setMerek(String newMerek) {
        Merek = newMerek;
    }
}
