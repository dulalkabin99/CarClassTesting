package com.company;

public abstract class Vehicles {

    private int numberofWheel;
    private String engieneType;
    private int speed;


    public int getNumberofWheel() {
        return numberofWheel;
    }

    public void setNumberofWheel(int numberofWheel) {
        numberofWheel = numberofWheel;
    }

    public String getEngieneType() {
        return engieneType;
    }

    public void setEngieneType(String engieneType) {
        this.engieneType = engieneType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    public String start(){
        return ("is starting ...");
    }
    public String accelerate(){
        return ("is accelerating... ");

    }
    public String readSpeeds(){
        return ("is going "+ getSpeed()+ " MPH...");
    }

    public String  stop(){
        return "is Stopped.";
    }

}
