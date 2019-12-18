package com.xuningchuan.demo.designpatterns.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xuningchuan
 * @Title: FilterSingle  只过滤 婚姻状况:单身
 * @Description:
 * @date 2019/12/18下午4:25
 */
public class FilterSingle implements FilterPerson {

    @Override
    public List<Person> filterPerson(List<Person> personList) {
        return personList.stream().filter(person -> "SINGLE".equalsIgnoreCase(person.getMaritalStatus())).collect(Collectors.toList());
    }
}
