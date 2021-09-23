package change_topic;


import java.util.ArrayList;
import java.util.List;

public class MySubject {
    public void demo(){
        List <String> subject = new ArrayList <String>();
        subject.add("Economics");
        subject.add("Commerce");
        subject.add("English");
        subject.add("Sociology");

        for (Object var : subject){
            System.out.println("This is all subject name details : "+var);
        }
    }
    public static void main(String[] args){
        MySubject obj = new MySubject();
        obj.demo();
    }


}
