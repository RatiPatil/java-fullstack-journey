package Practice;

public class Abstract {

    public static void main(String [] args){
        Student s = new Subjects();
        s.subjectsutop();
        s.attendancepercent();


    }
}


abstract class Student{

      abstract  void attendancepercent();
      abstract void  subjectsutop();

}


abstract class Working extends Student {

    @Override
    void attendancepercent() {
        System.out.println("my attendance is 100");
    }
}

class Subjects extends Working{
    void subjectsutop(){
        System.out.println("6");
    }
}





