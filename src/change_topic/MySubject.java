      package change_topic;


      import java.util.ArrayList;
      import java.util.List;

      public class MySubject {

          public void details(){

              List <Integer> age = new ArrayList<> ();
              age.add(34);
              age.add(22);
              age.add(45);
              age.add(29);
              age.add(32);
              for (Object var1 : age){
                  System.out.println("This is all employees age information : "+var1);
              }
          }
          public static void main(String[] args){
              MySubject obj = new MySubject();
              obj.details();
          }
}
