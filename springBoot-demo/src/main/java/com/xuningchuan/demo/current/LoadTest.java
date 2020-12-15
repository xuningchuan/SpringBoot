package com.xuningchuan.demo.current;

/**
 * @author xuningchuan
 * @Title: LoadTest
 * @Description:
 * @date 2020-05-28 19:59
 */
public class LoadTest {


    public static final int a = 1;

    public  final int b = 2;



    public   int c = 3;

    public  static int d = 4;

    public static int getD() {
        return d;
    }

    public static void setD(int d) {
        LoadTest.d = d;
    }

    static {
        System.out.println("加载" + a + d);
    }

    public static void staticMethod(int num){
        d = num;
        System.out.println("ss" + d);
    }

    public static void main(String[] args) {
        LoadTest loadTest = new LoadTest();
        loadTest.staticMethod(6);
        System.out.println(loadTest.getD());
//        loadTest.d;
    }

}
