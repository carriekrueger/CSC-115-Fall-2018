// Carrie Krueger
// 9-19-18
// This code shows how to use a Scanner to get input from the keyboard

// To read from the keyboard we use the premade Scanner class in Java
// Need to import to use most premade classes 

import java.util.Scanner; 

public class KeyboardInput {
    
    public static void main(String[] args) {
        
        String name; 
        int age;
        
        // INSTANTIATE (create) a Scanner that reads from the keyboard 
        
        Scanner sc = new Scanner(System.in);
        
        // This makes a Scanner named 'sc'
        
        // Prompt the user for information
        
        System.out.print("What is your name? ");  // no ln so they type on the same line
        name = sc.nextLine();   // reads in the line of text and stores it 
        
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        
        // Scanners have methods to read in the next piece of data, until there is a space 
        // since we are storing an int, we used '.nextInt()'
        
        // Echo 
        
        System.out.println("Hello, " + name + ". How does it feel being " + age + "?");
    }
}
        