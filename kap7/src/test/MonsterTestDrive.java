package test;

import main.Dragon;
import main.Monster;
import main.Vampire;

/**
 * Created with IntelliJ IDEA.
 * User: FISHSHAH
 * Date: 03.07.13
 * Time: 23:31
 * To change this template use File | Settings | File Templates.
 */
public class MonsterTestDrive {


    public static void main (String [] args){
        Monster[] ma = new Monster[3];
        ma [0] = new Vampire();
        ma [1] = new Dragon();
        ma [2] = new Monster();

        for(int x = 0; x < 3; x++) {
            ma[x].frigthen(x);
        }

    }
}