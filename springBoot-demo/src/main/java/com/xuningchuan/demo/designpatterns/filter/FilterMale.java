package com.xuningchuan.demo.designpatterns.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xuningchuan
 * @Title: FilterGender 只过滤 男性
 * @Description:
 * @date 2019/12/18下午4:25
 */
public class FilterMale implements FilterPerson {

    @Override
    public List<Person> filterPerson(List<Person> personList) {
        return personList.stream().filter(person -> "Male".equalsIgnoreCase(person.getGender())).collect(Collectors.toList());
    }
}
