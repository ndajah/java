public class DVDPlayTestDrive {
    public static void main(String[] args) {
        DVDPlay d = new DVDPlay();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord){
            d.recordDVD();

        }
    }
}
