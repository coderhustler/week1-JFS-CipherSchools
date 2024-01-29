package winterpep_github;
// Lecture 4 - Anatomy Of JAVA Library | Conditional Statements & Loops In JAVA (Part 2)

import java.util.Random;
import java.util.Scanner;
public class lecture4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); // System.in means keyboard input
        Random random=new Random();
        // nextInt(bound) or nextInt(limit) generates a random no between 0 to limit
        int computerChoice=random.nextInt(20);
        System.out.println("Computer choice: "+computerChoice);

        // GAME - Guess the Number

        for (int i=1;i<=6;i++) {
            int userChoice = sc.nextInt();
            if (userChoice > computerChoice) {
                System.out.println("Your guess is too high");
            } else if (userChoice < computerChoice) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("You guessed it right!!");
                break;
            }
        }

        /* EXPLANATION of LOOPS

        // WHILE
        char ch='A'; // 65
        while (ch<=90){
            System.out.println(ch+" ");
            ch++; //65+1
        }

        // DO WHILE
        char ch1='A';
        do {
            System.out.println(ch+" ");
            ch++;
        }while (ch<='Z');

        // SWITCH CASE
        // Get user division & print his rank(s)
        System.out.println("Enter your division");
        int div=sc.nextInt();
        switch (div){
            case 1:
                System.out.println("First Rank");
            case 2:
                System.out.println("Second Rank");
            case 3:
                System.out.println("Third Rank");
            default:
                System.out.println("No Rank");
        }

         */

        // QUESTION - Print r times in word "Burp" as given by user input
        System.out.println("How long is your Burp? ");
        int burpLength=sc.nextInt();
        String msg="";
        for (int i=1;i<=burpLength;i++){
            msg=msg+'r';
        }
        System.out.println("Bu"+msg+"p");

        // QUESTION - Police-Birthday
        System.out.println("Enter your speed");
        int speed=sc.nextInt();
        System.out.println("Is today your birthday");
        boolean isBirthday=sc.nextBoolean();

        if (isBirthday==true){
            speed-=5;
        }
        if (speed>80){
            System.out.println("High Ticket");
        }else if (speed>=60 & speed<=80){
            System.out.println("Mid Ticket");
        }else {
            System.out.println("No ticket");
        }


    }
}
