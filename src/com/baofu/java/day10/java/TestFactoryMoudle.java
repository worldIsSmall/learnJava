package com.baofu.java.day10.java;

/**
 * Created by BF100427 on 2020/7/13.
 */
public class TestFactoryMoudle {
    public static void main(String[] args) {
        IWorkFactory i =new StudentWorkFactory();
            i.getWork().doWork();

        IWorkFactory i1 = new TeacherWorkFactory();
           i1.getWork().doWork();

        StudentWorkFactory s =new StudentWorkFactory();
        s.getWork().doWork();
    }
}

interface IWorkFactory{
  Work getWork();
}
class StudentWorkFactory implements IWorkFactory{
    public Work getWork(){
        return new StudentWork();
    }
}

class TeacherWorkFactory implements IWorkFactory{
    public Work getWork(){
        return new TeacherWork();
    }
}

interface Work{
    void doWork();
}
class StudentWork implements  Work{
    public void doWork(){
        System.out.println("学生写作业");
    }
}

class TeacherWork implements Work{
    public void doWork(){
        System.out.println("老师批改作业");
    }
}




