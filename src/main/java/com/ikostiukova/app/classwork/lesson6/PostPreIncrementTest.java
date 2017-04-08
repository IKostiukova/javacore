package com.ikostiukova.app.classwork.lesson6;

/**
 * Created by irmar on 3/28/2017.
 */
public class PostPreIncrementTest {
    public static void main(String[] args) {
        //загуглить в какой последовотельности выполняются операции, почему в первом случае 6, а во втором 4
        int a = 1;
        a = a++ +a + ++a;
        int b = 2;
        b = b + b + ++b;
        System.out.println(a);
    }
}
