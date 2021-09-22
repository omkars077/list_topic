package change_topic;

import java.util.ArrayList;
import java.util.List;

public class MySubject {

    public void demooflist(){

        List student = new ArrayList();
        student.add("Rahul Sharma");
        student.add("Ajay Goyal");
        student.add("Manoj Kumar");
        student.add("Saurabh Sagar");
        student.add("Rohit Sharma");

        System.out.println("This is new admission : "+student.get(3));

        for (Object var : student){
            System.out.println("This is data of student : "+var);

        }
        student.remove(0);
        student.remove(3);
        for (Object var1 : student){
            System.out.println("After deleting data : "+var1);
        }

    }
    public static void main(String[] args){
        MySubject obj = new MySubject();
        obj.demooflist();
    }
}
