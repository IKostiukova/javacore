package com.ikostiukova.app.homework.lesson2;
import java.util.Scanner;
/**
 * Created by irmar on 2/19/2017.
 */
public class ScannerClass {
    public static float scannerInFloat(){
        Scanner scanner = new Scanner(System.in);
        float float1 = scanner.nextFloat();
        return float1;
    }
    public static int scannerInInt() {
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        return int1;
    }
    public static char scannerInChar(){
        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.next().charAt(0);;
        return char1;
    }
}
