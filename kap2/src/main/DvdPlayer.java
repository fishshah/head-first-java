package main;




public class DvdPlayer {

    boolean canRecord = false;

    void recordDVD () {
        System.out.println("DVD recording");

    }

    void playDVD () {
        System.out.println("playDVD");
    }
}

class DVDPlayerTestDrive {
    public static void main(String [] args) {

        DvdPlayer d = new DvdPlayer();
        d.canRecord = true;
        d.playDVD();

        if(d.canRecord == true) {
            d.recordDVD();
        }
    }
}