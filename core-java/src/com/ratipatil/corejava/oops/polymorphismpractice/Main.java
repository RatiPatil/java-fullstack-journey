import com.ratipatil.corejava.oops.polymorphismpractice.Developer;
import com.ratipatil.corejava.oops.polymorphismpractice.Employee;
import com.ratipatil.corejava.oops.polymorphismpractice.Tester;

public static void main(String [] data){
//    Employee emp = new Developer();
//    emp.work();
//
//    Employee emp = new Tester();
//    test.work();

    Employee emp = new Developer();
    emp.work();

    emp = new Tester();
    emp.work();



}