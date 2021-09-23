package change_topic;


import java.util.ArrayList;
import java.util.List;

public class MySubject {
    public void student(){

        List<Model> information = new ArrayList<> ();

        Model student1 = new Model("Surendra Kumar",26,"Commerce");
        information.add(student1);

        Model student2 = new Model("Manoj Kumar",29,"Computer");
        information.add(student2);

        Model student3 = new Model("Saurabh Sagar",25,"Science");
        information.add(student3);

        for (Model var1 : information){

            System.out.println("This is details of all students : "+var1.getName());
            System.out.println("This is all about of student age : "+var1.getAge());
            System.out.println("This is all information of subject : "+var1.getSubject());

        }
    }
    public static void main(String[] args){
        MySubject obj = new MySubject();
        obj.student();
    }






}
