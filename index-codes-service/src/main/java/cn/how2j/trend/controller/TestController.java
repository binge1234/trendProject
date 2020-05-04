package cn.how2j.trend.controller;

import java.util.Arrays;
import java.util.List;

public class TestController extends IndexController{

//    @Override
//    public void method1(){
//
//    }
public static void main(String[] args) {
    test1();
}
    public static void test1(){
        Integer[] a = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(a);
        System.out.println(list.size());
        list.add(1);
        System.out.println(list.size());
    }

    



}
