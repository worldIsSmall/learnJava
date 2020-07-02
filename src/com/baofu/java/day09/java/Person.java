package com.baofu.java.day09.java;

/**
 * Created by BF100427 on 2020/6/12.
 */
public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//        if (obj instanceof Person){
//            Person p =(Person)obj;
//            return  this.name == p.name && this.age ==p.age;
//        }else{
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        return !(getName() != null ? !getName().equals(person.getName()) : person.getName() != null);

    }
//    public String toString(){
//        return "Person: name="+name+" age="+age;
//    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
