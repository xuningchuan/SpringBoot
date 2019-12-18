package com.xuningchuan.demo.designpatterns.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xuningchuan
 * @Title: FilterFemale  只过滤 女性
 * @Description:
 * @date 2019/12/18下午4:25
 */
public class FilterFemale implements FilterPerson {

    @Override
    public List<Person> filterPerson(List<Person> personList) {
        return personList.stream().filter(person -> "FEMALE".equalsIgnoreCase(person.getGender())).collect(Collectors.toList());
    }
}
