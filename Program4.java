//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class Program4{
    public static void main(String[] args){
        // Asign 4 variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        
        //Ask for user input by creating scanner
        Scanner numScan = new Scanner(System.in);
        
        System.out.println("Enter a 3 digit number: ");
        num1 = numScan.nextInt();
        System.out.println("Enter another 3 digit number: ");
        num2 = numScan.nextInt();
        System.out.println("Enter another 3 digit number: ");
        num3 = numScan.nextInt();
        System.out.println("Enter another 3 digit number: ");
        num4 = numScan.nextInt();
        
        //calculate sum and average
        
        int sumAll = num1 + num2 + num3 + num4;
        double average = sumAll/4.0;
        
        //print result
        System.out.println("The sum of the 4 numbers is " + sumAll);
        System.out.println("The average of 4 numbers is " + average);
    }
}


//Paste console output below:
/*
Enter a 3 digit number: 
475
Enter another 3 digit number: 
821
Enter another 3 digit number: 
369
Enter another 3 digit number: 
562
The sum of the 4 numbers is 2227
The average of 4 numbers is 556.75

*/
