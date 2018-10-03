// Carrie Krueger
// 10-3-18
// Some things we can do with Strings 

import java.util.Scanner;

public class StringNotes {
    
    public static void main(String[] args) {
        
        /*
        We use int and double quite a bit...
        Those are primitive data types.
        
        OBJECTS can act like primitive data types,
        but can do a whole lot more.
        
        OBJECTS can have attributes (stored information),
        and have "methods" that do things.
        
        Here are just some of the things that a String can do:
        - length --> returns the length (number of characters)
        - toUpperCase --> converts to UpperCase 
        - toLowerCase --> converts to LowerCase 
        - equals --> way to compare two String objects to see if they match 
                 We use == to test primitives...
                 But we use .equals to compare Objects 
        - charAt --> returns a character in the String that's at a certain position
        
        SO MUCH MORE..... check out the Relevant API 
        
        */
        
        String name = "Ronald McDonald";
        
        int lengthOfString = name.length();
        char randomLetter = name.charAt(10);
        
        //System.out.println("The length is " + name.length());
        System.out.println("The length is " + lengthOfString);
        
        System.out.println("The character at position 1 is " + name.charAt(1)); // Strings start at 0
        System.out.println("The character at position 14 is "+ name.charAt(14));
        //System.out.println("The character at position 15 is "+ name.charAt(15));  // ERROR
        
        System.out.println("UPPERCASE: " + name.toUpperCase());
        System.out.println(name);
        
        name = name.toUpperCase();
        System.out.println(name);
        
        String str1 = "Star Trek";
        String str2 = "Star Wars";
        
        //if(str1 == str2)
        
        if(str1.equals(str2)) {
            
            System.out.println("They are the same!");
        } else {
            
            System.out.println("They are NOT the same!");
        }
        
        
    }

}
