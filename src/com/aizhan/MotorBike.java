package com.aizhan;

public class MotorBike {
    //int speed;

    private int speed;
    //behaviour
    //method
    //inputs - int speed
    //outputs - void
    //name - setSpeed

    public void setSpeed(int speed){ // local variable
       if (speed > 0)
        // System.out.println(speed);
        // System.out.println(this.speed);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed(int howMuch){
        this.speed = this.speed + howMuch;
    }

    public void decreaseSpeed(int howMuch) {
        if (this.speed -howMuch > 0)
        this.speed = this.speed - howMuch;
    }

    void start(){
        System.out.println("Bike started");

    }
}
