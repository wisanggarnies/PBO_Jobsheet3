public class MobilManual extends MobilMatic { 
    private int gear = 0;

    public void tambahGear() {
        gear = gear +1;
    }

    public void kurangiGear() {
        gear = gear -1;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Gear : " + gear);
    }
}
