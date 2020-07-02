package com.baofu.java.day08.exerce.baseClass;

/**
 * Created by BF100427 on 2020/6/11.
 */
public class Person {
    protected String name ="person";
    protected int age = 50;
    public String getInfo(){
        return "Name:"+name+"\n"+"age:"+age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return !(name != null ? !name.equals(person.name) : person.name != null);

    }


}

