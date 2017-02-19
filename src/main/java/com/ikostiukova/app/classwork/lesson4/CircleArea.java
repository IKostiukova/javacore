package com.ikostiukova.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by irmar on 2/14/2017.
 */
public class CircleArea {
    public static double calculateCircleArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI*Math.sqrt(radius);
        System.out.println("Area is "+ circleArea);
        return circleArea;
    }
    public static void calculateBigger(){
        double circleArea1 = CircleArea.calculateCircleArea();
        double circleArea2 = CircleArea.calculateCircleArea();
        if(circleArea1>circleArea2){
            System.out.println("Circle Area 1 is bigger");
        }
        else if (circleArea1<circleArea2){
            System.out.println("Circle Area 2 is bigger");
        }
        else {
            System.out.println("Circle areas are the same");
        }

    }
}
