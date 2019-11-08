package org.launchcode.java.studios.areaofacircle.studios;

import java.util.Scanner;

public class Area {
    /*int r;
    double pi = 3.14, Area;
    Scanner s = new Scanner(System.
    System.out.print("Enter a radius:");
    r = s. nextInt();
    area = pi * r * r;
System. out. println("Area of circle:" + Area);*/
//area of a circle = pi(3.14) * r(radius) * r(radius)

    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter a radius:");
        double r= s.nextDouble();
        double  area=Circle.getArea(r);
        System.out.println("Area of Circle is: " + area);
    }
}











