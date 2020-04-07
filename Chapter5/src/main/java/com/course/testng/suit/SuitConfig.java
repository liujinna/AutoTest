package com.course.testng.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuitConfig {
    @BeforeSuite
    public void  beforeSuit(){
        System.out.println("before suite运行啦");
    }
    @AfterSuite
    public void  afterSuit(){
        System.out.println("after suit 运行啦");
    }
    @BeforeTest
    public void  beforeTest(){
        System.out.println("before test运行啦");
    }
    @AfterTest
    public void  afterTest(){
        System.out.println("after test运行啦");
    }
}
