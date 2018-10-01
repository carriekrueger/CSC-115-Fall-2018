// Carrie Krueger
// 10-1-18
// Efficiently using if statements 
import java.util.Scanner;

public class MoreIfs {
    public static void main(String[] args) {
        
        // When you have code that ends up being repeated/reused in your program
        
        // preferred way
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = sc.nextInt();
       
       
        if(age >= 65) {
            
             System.out.println("You're old!");  // only print for the oldies
        }
        
        System.out.println(age + " is a good age.");  // print every time
       
       
       
        // less preferred way [commented out]
        
        /*
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = sc.nextInt();
        
        if(age >= 65) {
            
            System.out.println("You're old!");
            System.out.println(age + " is a good age.");
        }
        if(age < 65) {
            
            System.out.println(age + " is a good age.");
        }
        */
    }
}
