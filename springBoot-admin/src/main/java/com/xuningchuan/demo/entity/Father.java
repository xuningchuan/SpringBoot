package com.xuningchuan.demo.entity;

/**
 * @author xuningchuan
 * @Title: Father
 * @Description:
 * @date 2020-04-06 11:33
 */
public class Father {
    {
        System.out.println("father span");
    }

    static int a = print("static father");
     int b = print("normal father");

    Father(){
        System.out.println("father Constructor");
    }


    private static int print(String str) {
        System.out.println(str);
        return 1;
    }


}
