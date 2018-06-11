package com.company;
import java.util.Scanner;

public class CarApp {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Cars a =new Cars();
        Cars b=new Cars();

        a.setColor("Silver");
        a.setMake("Honda");
        a.setModel("CRV");
        a.setWeight(40000);
        a.setYear(2018);
        a.setNumberofWheel(4);
        a.setEngieneType("V6");
        a.setSpeed(99);



        b.setColor("Black");
        b.setMake("Porche");
        b.setModel("MV201");
        b.setWeight(35000);
        b.setYear(2019);
        b.setNumberofWheel(4);
        b.setEngieneType("V12");
        b.setSpeed(88);



        System.out.println(a.start());

        System.out.println(b.start());
        System.out.println(a.accelerate());
        System.out.println(b.accelerate());
        System.out.println(a.printSpeed());
        System.out.println(b.printSpeed());
        System.out.println(b.stop());
        System.out.println(a.stop());






        }
    }

