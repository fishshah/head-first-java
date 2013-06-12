package main;

class Dog {

    int size;
    String name;


    void bark() {
        if(size > 60) {
            System.out.println("Woof");
        } else if (size > 14) {
            System.out.println("ruff");


        } else {
            System.out.println("hykl");

        }
    }
}
