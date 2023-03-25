package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgTests {

    @Test
    public void myTestNGTest(){
        System.out.println("****Running TestNG Test Case");
        Assert.assertTrue(true);
    }

}
