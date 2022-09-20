public class RunMobil {
    public static void main (String[] args){
        MobilMatic mm1 = new MobilMatic();
        MobilManual mm2 = new MobilManual();
        mm1.setMerek("Brio");
        mm1.nyalaMesin();
        mm1.tambahKecepatan();
        mm1.cetakStatus();

        mm2.setMerek("Panter");
        mm2.nyalaMesin();
        mm2.tambahGear();
        mm2.tambahKecepatan();
        mm2.cetakStatus();
    }
}
