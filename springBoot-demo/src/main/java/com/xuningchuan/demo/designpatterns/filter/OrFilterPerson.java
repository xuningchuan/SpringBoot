package com.xuningchuan.demo.designpatterns.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xuningchuan
 * @Title: OrFilter   或 过滤
 * @Description:
 * @date 2019/12/18下午4:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrFilterPerson implements FilterPerson{

    private FilterPerson filterPerson;

    private FilterPerson otherFilterPerson;


    @Override
    public List<Person> filterPerson(List<Person> personList) {
        List<Person> resultList = filterPerson.filterPerson(personList);
        resultList.addAll(otherFilterPerson.filterPerson(personList));
        return resultList.stream().distinct().collect(Collectors.toList());
    }
}
