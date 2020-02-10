package com.xuningchuan.demo.designpatterns.iterator;

/**
 * @author xuningchuan
 * @Title: ConcreteCollection 姓名集合具体类
 * @Description:
 * @date 2020-02-10 11:35
 */
public class NameCollection implements Collection{

    String[] nameArr = {"刘备", "关羽", "张飞"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    private class NameIterator implements Iterator{
        int index;

        @Override
        public Boolean hasNext() {
            return index < nameArr.length;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return nameArr[index++];
            }else {
                return null;
            }
        }
    }
}
