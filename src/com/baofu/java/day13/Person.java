package com.baofu.java.day13;

import java.util.Comparator;

/**
 * Created by BF100427 on 2020/8/6.
 */
public class Person implements Comparable {
    private String name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        return !(getAge() != null ? !getAge().equals(person.getAge()) : person.getAge() != null);

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
        return result;
    }
    //当向TreeSet中添加Person类的对象时，依据此方法，确定按照哪个属性排序
    @Override
    public int compareTo(Object o) {
//        if ( o instanceof Person){
//            Person p =(Person)o;
//            return this.name.compareTo(p.name);
//        }
        return 0;
    }

}
