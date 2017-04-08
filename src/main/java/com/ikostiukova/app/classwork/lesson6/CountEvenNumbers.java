package com.ikostiukova.app.classwork.lesson6;

/**
 * Created by irmar on 3/28/2017.
 */
public class CountEvenNumbers {
    public static void main(String[] args) {
        int count = 0;
        //for unknown numbers i%2==0 is used
        for(int i=0; i<=20; i+=2){
             count++;
        }
        System.out.println(count);
    }
}
