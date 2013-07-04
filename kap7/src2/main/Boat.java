package main;

/**
 * Created with IntelliJ IDEA.
 * User: FISHSHAH
 * Date: 03.07.13
 * Time: 23:34
 * To change this template use File | Settings | File Templates.
 */
public class Boat {


    private int length;


    public void setLength (int len){
        length=len;
    }

    public int getLength() {
        return length;
    }

    public void move() {
        System.out.println("Drift");
    }
}
