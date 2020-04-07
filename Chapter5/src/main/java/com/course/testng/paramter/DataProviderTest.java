package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void paramTest1(String name,int age){
        System.out.println("name:"+name+";  age:"+age);
    }

    @DataProvider(name="data")
    public Object[][]  hahah(){
        Object[][] o = new Object[][]{
                {"zhangshan",10},
                {"lili", 11},
                {"lisi", 12}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void paramTest3(String name,int age){
        System.out.println("name:"+name+";  age:"+age);
    }

    @Test(dataProvider = "methodData")
    public void paramTest4(String name,int age){
        System.out.println("name:"+name+";  age:"+age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] ret = null;
        if(method.getName().equals("paramTest3")){
            ret = new Object[][]{
                    {"zhangshan",20},
                    {"lili", 21},
                    {"lisi", 22}
            };
        }else if(method.getName().equals("paramTest4")){
            ret = new Object[][]{
                    {"zhangshan",30},
                    {"lili", 40},
                    {"lisi", 50}
            };
        }
        return ret;
    }
}
