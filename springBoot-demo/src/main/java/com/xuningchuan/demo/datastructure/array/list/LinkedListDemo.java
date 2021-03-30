package com.xuningchuan.demo.datastructure.array.list;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author xuningchuan
 * @Title: ArrayListDemo  arrayList
 * @Description:
 * @date 2021-02-20 16:16
 */
public class LinkedListDemo<E> {

    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        list.add("a");
//        list.add("b");
//        list.add("b");
//        list.add("c");
//        list.add("b");
////        list.remove("b");
//        for (int i = list.size() - 1; i < list.size() && i >= 0; i--) {
//            if("b".equals(list.get(i)))
//                list.remove(i);
//        }
////        list.removeIf("b"::equals);
//        list.forEach(System.out::println);
//
        Set<String> set = new HashSet<>();

        set.add("cc");
        set.add("bb");
        set.add("aa");
        set.forEach(System.out::println);

        System.out.println(set.hashCode());
//
//        Set<String> set1 = new LinkedHashSet<>();
//
//        set1.add("bb");
//        set1.add("aa");
//        set1.add("cc");
//        set1.forEach(System.out::println);

////
//        Set<String> set2 = new TreeSet<>();
//        set2.add("bb");
//        set2.add("aa");
//        set2.add("cc");
//        set2.forEach(System.out::println);
//
//        TreeMap<String, String> treeMap = new TreeMap<>();
//        treeMap.put("a", "aa");
//        treeMap.put("b", "bb");
//        treeMap.put("c", "cc");
//
//        treeMap.remove("a");


    }

}
