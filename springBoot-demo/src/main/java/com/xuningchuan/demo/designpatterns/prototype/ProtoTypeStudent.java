package com.xuningchuan.demo.designpatterns.prototype;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuningchuan
 * @Title: ProtoTypeShape 原型模式  1.创建对象效率高 2.避免构造函数的约束  --适用于频繁创建对象 或 对象中的引用类型互不干扰等情况 使用
 * *                     clone 方式：默认浅复制方式 即只复制基本类型 当类中变量是有引用类型时 手动实现复制 已达到 深复制效果
 * @Description:
 * @date 2019/12/9下午6:05
 */
@Data
public class ProtoTypeStudent implements Cloneable {

    private String name;

    private Map<String, Double> scores;

    @Override
    public ProtoTypeStudent clone() {

        ProtoTypeStudent clone = null;
        try {
            clone = (ProtoTypeStudent) super.clone();
            clone.scores = (Map<String, Double>) ((HashMap) this.scores).clone();// 变量是引用类型时 手动复制
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

    public static void main(String[] args) {

        Map<String, Double> scores = new HashMap<>();
        scores.put("math", 88.8);
        ProtoTypeStudent StudentA = new ProtoTypeStudent();
        StudentA.setName("张三");
        StudentA.setScores(scores);

        ProtoTypeStudent StudentB = StudentA.clone();
        StudentB.setName("clone 张三");
        StudentB.getScores().put("math", 99.9);

        System.out.println(StudentA);
        System.out.println(StudentB);

    }

}
