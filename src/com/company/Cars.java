package com.company;
public class Cars extends Vehicles {


    private String color;
    private String make;
    private String model;
    private int year;
    private int weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String thisCar(){
        return getYear() + " " + getMake()+" " + getModel() + " ";
    }
@Override
    public String start() { return thisCar()+"  "+super.start(); }

@Override
    public String accelerate(){
        return (thisCar()+ " "+ super.accelerate());
}
@Override
    public String stop(){
        return (thisCar()+ " is "+ super.stop());
    }
    public String printSpeed(){
        return (thisCar()+" " +super.readSpeeds());
    }


}