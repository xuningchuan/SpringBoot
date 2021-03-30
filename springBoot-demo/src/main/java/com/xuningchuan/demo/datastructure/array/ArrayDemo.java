package com.xuningchuan.demo.datastructure.array;

/**
 * @author xuningchuan
 * @Title: ArrayDemo  数组
 * @Description:
 * @date 2021-02-20 10:26
 */
public class ArrayDemo {


    /** 数组：
     *    1.同一类型数据的集合 根据索引访问 长度固定
     *
     *
     */
    public static void main(String[] args) {

        //declaration 数组声明

        //动态声明
        int[] array = new int[5];
        //静态声明 完整 推荐
        int[] bArray = new int[]{0,1,2,3,4};
        //静态声明 简略
        int[] cArray = {0,1,2,3,4};



        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("one array begin");
        for (int i : array) {
            System.out.println(i);
        }
        for (int i = 0; i < array.length; i++) {

        }
        System.out.println("one array end");


        //二维数组
        int[][] arrays = new int[][] {{1, 2}, {4, 5, 6}};

        int[][] bArrays = new int[2][3];
        bArrays[0][0]= 1;
        bArrays[0][1]= 2;

        bArrays[1][0]= 1;
        bArrays[1][1]= 2;
        bArrays[1][2]= 3;

        System.out.println("two array begin");

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("====" + i + "====");
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.println(arrays[i][j]);
            }
        }
//        for (int[] ints : arrays) {
//            for (int anInt : ints) {
//                System.out.println(anInt);
//            }
//        }
        System.out.println("two array end");
    }
}
