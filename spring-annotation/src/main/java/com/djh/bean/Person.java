package com.djh.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Author AceDJH
 * @Date 2021/1/4 17:26
 */
public class Person {
    @Value("令狐冲")
    private String name;
    @Value("#{20 + 8}")
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
