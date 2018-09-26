// Carrie Krueger
// 9-26-2018
// Ifs and Elses 

import java.util.Scanner;

public class IfElseStatements {
    
    public static void main(String[] args) {
        
        // Task:  ask the user for a number and tell them if it's even 
        
        Scanner sc = new Scanner(System.in);   // makes a scanner that reads from the keyboard 
        
        System.out.println("Enter a number:");  // prompt the user for a number
        
        int number = sc.nextInt();  // read and store number
        
        
        /*
           Three common mistakes:
           1. DON'T put a ';' after the if()
           2. DO put curly braces { } around the code to be executed if if statement is true
           3. DO remember to test for equality with '=='
        */
        
        if(number % 2 == 0)   {              // test for 'eveness' using mod
           
           System.out.println(number + " is even.");
           System.out.println("Hiiiiiiii");
        
        }
        
        System.out.println("Rock on!");   // print every time
        
        
        // Task:  compare two numbers
        
        int num1 = -10;
        int num2 = 5;
        int num3 = 25;
        
        if(num1 > num2)  {        // compare and output message
    
            System.out.println("num1 is greater than num2!");
        }  else {
            
            System.out.println("num1 is not greater than num2!");
        }
    }
}