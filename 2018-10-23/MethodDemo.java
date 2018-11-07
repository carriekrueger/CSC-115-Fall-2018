// Carrie Krueger
// 10-24-18
// A menu of math to demonstrate methods

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {  // main methods runs the program (major steps --> methods)
    
        Scanner sc = new Scanner(System.in);
        
        int num1;                       // Ask the user for 2 numbers
        int num2;
        
        System.out.println("Enter number 1: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter number 2: ");
        num2 = sc.nextInt();
        
        // Display a menu of options 
        // This method is a CODE DISPLACER
        
        showMenu();
        
        // Get user's choice
        // could make another code displacer method (same with above input) BUT Scanner scope issue
        
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        
        // do the thing they want to do
        // Where are the dots? Don't need the dot posession if your method is defined in the class
        // where you are calling it
        
        
        if(choice == 1) {
            
            add(num1, num2);        // This method shows how parameters work
        }
        
        if(choice == 2) {
            
            divide(num1, num2);     // more parameters
        }
        
        if(choice == 3) {           
            
            int answer = square(num1);          // return a value to a variable
            System.out.println(answer);
            
            //System.out.println(square(num1));    // return to a print statement
        }
        
        if(choice == 4) {
            
            System.out.println("The exponentiation is " + exp(num1, num2));  // return to a print statement
        }
        
    }
    
    // This method displays a menu of options
    public static void showMenu() {
        
        System.out.println("\nPlease choose from the following: ");
        System.out.println("\t1. Add the two numbers");
        System.out.println("\t2. Divide the two numbers");
        System.out.println("\t3. Square the first number");
        System.out.println("\t4. Exponentiate the two numbers");
        
        System.out.println();
        
    }
    
    // This method displays the sum of two numbers
    public static void add(int a, int b) {
        
        System.out.println("The sum of " + a + " + " + b + " is " + (a + b));
    }
    
    //This method displays the quotient of two numbers
    public static void divide(int a, int b) {
        
        if(b == 0) {
            System.out.println("You can't divide by 0!");
        } else {
            System.out.println("The quotient of " + a + "/" + b + " is " + (1.0*a/b));
        }
    }
    
    // This method returns the square of a number
    public static int square(int a) {
        
        int sqr = a * a;
        return sqr;
        
        // return a * a;           // shorter
    }
    
    // This method returns a raised to the b power
    public static int exp(int a, int b) {
        
       // return Math.pow(a, b);   // cheat code (change return type to double)
       
       // let's write our own! :)
       
       int counter = 0;
       int answer = 1;
       
       while(counter < b) {
           
           answer *= a;
           counter++;
       }
       
       return answer;
    }
    
  
    
}
