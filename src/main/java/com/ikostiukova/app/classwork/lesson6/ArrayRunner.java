package com.ikostiukova.app.classwork.lesson6;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/**
 * Created by irmar on 3/30/2017.
 */
public class ArrayRunner {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3};
        for (int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }

        boolean[] booleanArray = {true, false, false};
        for (int i=0; i<booleanArray.length; i++){
            System.out.println(booleanArray[i]);
        }

        char[] charArray = {'h', '-', '%'};
        for (int i=0; i<charArray.length; i++){
            System.out.println(charArray[i]);
        }

        double[] doubleArray = {1.1, 2.2, 3.3};
        for (int i=0; i<doubleArray.length; i++){
            System.out.println(doubleArray[i]);
        }

        long[] longArray = {30000000, 40000000, 50000000};
        for (int i=0; i<longArray.length; i++){
            System.out.println(longArray[i]);
        }


        int[] intArray2 = {3, 4};
        //FOR EACH loop
        for (int element: intArray2){
            System.out.println(element);
        }

        System.out.println(Arrays.toString(intArray2));
    }
}
