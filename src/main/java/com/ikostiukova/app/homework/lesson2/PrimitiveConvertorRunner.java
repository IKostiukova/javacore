package com.ikostiukova.app.homework.lesson2;

/**
 * Created by irmar on 2/19/2017.
 */
public class PrimitiveConvertorRunner {
    public static void main(String[] args) {
        System.out.println("Please enter float value");
        float float1 = ScannerClass.scannerInFloat();
        char char1 = PrimitiveConvertor.floatToChar(float1);
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);

        System.out.println("Please enter int value");
        int int1 = ScannerClass.scannerInInt();
        char char2 = PrimitiveConvertor.intToChar(int1);
        System.out.println("Input int value is " + int1 + ". Output char value is " + char2);

        System.out.println("Please enter char value");
        char char3 = ScannerClass.scannerInChar();
        int int2 = PrimitiveConvertor.charToInt(char3);
        System.out.println("Input char value is " + char3 + ". Output int value is " + int2);
    }
}
