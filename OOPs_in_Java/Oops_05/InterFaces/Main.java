package com.Kunal.Oops_05.InterFaces;

public class Main {
    public static void main(String[] args) {
   //     Car car = new Car();
//        car.acc();
//        car.start();
//        car.stop();

//        Media carMedia = new Car();
//        carMedia.stop();  // for this we can create a separate classes
        // here problem is that if we want to media player it will run for the stop engine

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
