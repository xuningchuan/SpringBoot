package com.xuningchuan.demo.entity;

/**
 * @author xuningchuan
 * @Title: Son
 * @Description:
 * @date 2020-04-06 11:33
 */
public class Son extends Father{
    {
        System.out.println("son span");
    }

    static int c = print("static son");
     int d = print("normal son");
    int b = 2;


    Son(){
        System.out.println("son Constructor");
    }


    private static int print(String str) {
        System.out.println(str);
        return 1;
    }

    public static void main(String[] args) {
        new Son();
    }



}
