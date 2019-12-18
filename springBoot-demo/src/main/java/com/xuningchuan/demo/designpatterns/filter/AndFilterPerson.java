package com.xuningchuan.demo.designpatterns.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author xuningchuan 且过滤
 * @Title: AndFilter
 * @Description:
 * @date 2019/12/18下午4:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AndFilterPerson implements FilterPerson{

    private FilterPerson filterPerson;

    private FilterPerson otherFilterPerson;


    @Override
    public List<Person> filterPerson(List<Person> personList) {

        return otherFilterPerson.filterPerson(filterPerson.filterPerson(personList));
    }
}
