package com.course.testng.groups;

import org.testng.annotations.Test;


public class GroupsOnClass2 {
    @Test(groups = {"stu","teach"})
    public void stu1(){
        System.out.println("GroupsOnClass2中的stu11111运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2中的stu222222运行");
    }
}
