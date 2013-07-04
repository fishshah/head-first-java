package main;

/**
 * Created with IntelliJ IDEA.
 * User: FISHSHAH
 * Date: 03.07.13
 * Time: 23:36
 * To change this template use File | Settings | File Templates.
 */
public class TestsBoats {

    public static void main (String [] args){

        Boat b1 = new Boat();
        SaliBoat b2 = new SaliBoat();
        RowBoat b3 = new RowBoat();

        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }

}

