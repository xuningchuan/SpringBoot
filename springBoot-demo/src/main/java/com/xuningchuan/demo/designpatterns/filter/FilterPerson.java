package com.xuningchuan.demo.designpatterns.filter;


import java.util.List;

/**
 * @author xuningchuan
 * @Title: Filter  过滤 人员接口
 * @Description:
 * @date 2019/12/18下午4:22
 */
public interface FilterPerson {

    List<Person> filterPerson(List<Person> personList);
}
