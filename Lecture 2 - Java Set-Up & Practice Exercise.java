package winterpep_github;
// Lecture2 - Java Set-Up & Practice Exercise
import java.util.Scanner;
public class lecture2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("Neutral\n");
        }else if (num>0){
            System.out.println("+ve number");
        }else{
            System.out.println("-ve number");
        }
        */

        // Question - ENROLLMENT PAYROLL
        System.out.println("Enter your basic pay (Salary)");
        double bp = sc.nextInt(), hra=0,da=0;
        if (bp>=5000){
            hra = 0.1*bp;
            da = 0.2*bp;
        }else {
            hra = 0.2*bp;
            da = 0.3*bp;
        }
        double gp=hra+da+bp;
        System.out.println("HRA: "+hra+" DA: "+da+ " Gross pay: "+gp);
    }
}
