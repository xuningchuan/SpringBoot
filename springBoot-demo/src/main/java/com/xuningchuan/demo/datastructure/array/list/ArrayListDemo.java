package com.xuningchuan.demo.datastructure.array.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;

/**
 * @author xuningchuan
 * @Title: ArrayListDemo  arrayList
 * @Description:
 * @date 2021-02-20 16:16
 */
public class ArrayListDemo<E> {

    //数组元素
    private Object[] arrayData = {};
    //数组元素个数
    private int size;




    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E get(int index){
        if(index > size - 1)
            throw new RuntimeException("array out of bound");
        return (E)arrayData[index];
    }

    public boolean add(E e){
        ensureCapacity(size + 1);
        arrayData[size++] = e;
        return true;
    }

    public boolean add(int index, E e){
        if(index > size || index < 0)
            throw new RuntimeException("array out of bound");
        ensureCapacity(size + 1);
        System.arraycopy(arrayData, index, arrayData, index + 1, size - index);
        arrayData[index] = e;
        size++;
        return true;
    }






    //确保扩容
    private void ensureCapacity(int minCapacity) {
        if(arrayData.length < minCapacity)
            grow(minCapacity);
    }

    //扩容
    private void grow(int minCapacity) {
        int newCapacity =arrayData.length + arrayData.length >> 1;
        newCapacity = Math.max(newCapacity, minCapacity);
        newCapacity = Math.min(newCapacity, Integer.MAX_VALUE);
        arrayData = Arrays.copyOf(arrayData, newCapacity);
    }


    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        System.out.println("原.begin");
//        arrayList.add("a");
//        arrayList.add("b");
//        arrayList.add("c");
//        arrayList.add("a");
//        arrayList.add("d");
//
//
//        arrayList.forEach(System.out::println);
//
//        arrayList.removeIf("a"::equals);  // 正确删除list 的方式 1.倒叙删除 不会少删 2. 迭代器删除 3. list filter 删除
//        arrayList.forEach(System.out::println);
//        System.out.println("原.end");
//
//
//        ArrayListDemo<String> arrayListDemo = new ArrayListDemo<>();
//        System.out.println("======分割线======");
//        System.out.println("新.begin");
//        arrayListDemo.add("a");
//        arrayListDemo.add(1,"b");
//        for (int i = 0; i < arrayListDemo.size(); i++) {
//            System.out.println(arrayListDemo.get(i));
//        }
//        System.out.println("新.begin");


        BitSet bitSet = new BitSet(60);
//        bitSet.set(65);
        bitSet.set(0);
        bitSet.set(1);
//        bitSet.set(2);
//        bitSet.set(8);
//        bitSet.set(9);

        BitSet bitSet2 = new BitSet(60);
        bitSet2.set(1);
        bitSet2.set(2);

        // 交集
        bitSet.and(bitSet2);

        // 并集
        bitSet.or(bitSet2);

        // 补集
        bitSet.andNot(bitSet2);




//        int size = bitSet.cardinality();
        // 排序
        for(int i = bitSet.nextSetBit(0); i >=0 ; i = bitSet.nextSetBit( i + 1)){
            System.out.println(i);
        }
    }




    public static int getBitNum(int num) {
        if (num == 0) {
            return -1;
        }
        if (num == 1) {
            System.out.println("为1的位置有：  " + 0);
            return 0;
        }
        //根据对数换底公式 logx(y) =loge(y) / loge(x)可推出
        int bNum = (int) (Math.log(num) / Math.log(2));
        System.out.println("为1的位置有：  " + bNum);
        getBitNum((int) (num % (Math.pow(2, bNum))));
        return bNum;
    }

}
