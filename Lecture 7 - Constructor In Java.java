package winterpep_github;
// Lecture 7 - Constructor In Java
public class lecture7 {
    public static void main(String[] args) {
        /*
        Employee sammer;
        Employee rahul=new Employee();

//        sammer is dead because we have called constructor for him
//        rahul is alive because we have called constructor for him, and it has been instantiated
         */


//        Employee harsha=new Employee();
//        Employee varsha=new Employee();
//    uncomment first Constructor in class Employee to see how Constructor takes fixed values only
//    although harsha&varsha are diff, but we will get same values for them -> to overcome this, we can define parameters in Constructors

        Employee harsha=new Employee(102,4500,"Development");
        Employee varsha=new Employee(101,3000,"Testing");
        System.out.println(harsha.employeeID+ " Salary "+ harsha.salary+" Dept.: "+harsha.dept);
        System.out.println(varsha.employeeID+ " Salary "+ varsha.salary+" Dept.: "+varsha.dept);

    }
}
class Employee{
    int employeeID;
    int salary;
    String dept;


//    Employee(){
////        uncomment first Constructor in class Employee to see how Constructor takes fixed values only
//        employeeID=1000;
//        salary=3000;
//        dept="Development";
//    }
    Employee(int empid, int sal, String d){

        employeeID=empid;
        salary=sal;
        dept=d;
        /*
        <identification>
        This is a Constructor
        1. same name as class name
        2. no return type, not even void

        <purpose>
        1. it creates/initailizes Object in Memory(RAM)
        2.
         */
    }
}
