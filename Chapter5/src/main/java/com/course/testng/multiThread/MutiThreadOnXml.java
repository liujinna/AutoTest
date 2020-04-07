package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MutiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("thread:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("thread:%s%n",Thread.currentThread().getId());
    }
}
