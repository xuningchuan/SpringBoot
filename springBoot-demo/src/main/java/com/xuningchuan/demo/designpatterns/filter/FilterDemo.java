package com.xuningchuan.demo.designpatterns.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuningchuan  过滤器模式: 使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来 -- 结构型模式
 * @Title: FilterDemo
 * @Description:
 * @date 2019/12/18下午4:16
 */
public class FilterDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        FilterMale male = new FilterMale();
        FilterFemale female = new FilterFemale();
        FilterSingle single = new FilterSingle();

        FilterPerson singleMale = new AndFilterPerson(single, male);
        FilterPerson singleOrFemale = new OrFilterPerson(single, female);

        System.out.println("Males: ");
        printPersons(male.filterPerson(persons));

        System.out.println("\nFemales: ");
        printPersons(female.filterPerson(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.filterPerson(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.filterPerson(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                +", Gender : " + person.getGender()
                +", Marital Status : " + person.getMaritalStatus()
                +" ]");
        }
    }
}
