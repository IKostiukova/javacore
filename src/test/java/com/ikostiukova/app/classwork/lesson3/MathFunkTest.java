package com.ikostiukova.app.classwork.lesson3;

import com.ikostiukova.app.classwork.lesson3.MathFunc;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by irmar on 2/9/2017.
 */
public class MathFunkTest {
    @Test
    public void multiplyTest(){
        int a = 1, b = 2, exRes = 2;
        Assert.assertEquals(exRes, MathFunc.multiply(a,b));
    }
}
