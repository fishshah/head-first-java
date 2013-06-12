package main;

public class ElectricGuitar {


    String brand;
    int numOfPickups;
    boolean rockStarUseslt;


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNumOfPickups(int numOfPickups) {
        this.numOfPickups = numOfPickups;
    }

    public void setRockStarUseslt(boolean rockStarUseslt) {
        this.rockStarUseslt = rockStarUseslt;
    }


    public String getBrand() {
        return brand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public boolean getRockStarUseslt() {
        return rockStarUseslt;
    }
}