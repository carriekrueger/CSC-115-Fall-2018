// Carrie Krueger
// 9/12/18
//Let's talk about variables

public class Variables {
    
        public static void main(String[] args) {
            
            // There are 8 "primitive data types"
            // we will focus on 4
            
            // When you want to use a variable:  declare
            // When you want to give your variable a value:  assign using =
            // You can do both at once!
            
            // int       num     =   28;
            // type
            //           name
            //                       value
            
            // variables start with a LOWERCASE and follow camelCase
            
            int a = 4;    // integer  (whole number, negative or postive)
            int a2 = 5;
            
            // you can do stuff with variables -> print, do math, etc.
            
            int a3 = a + a2;
            System.out.println(a3);
            
            //int x;  //x has been DECLARED, but not ASSIGNED (not initialized)
            //System.out.println(x); // error!  doesn't compile
            
            System.out.println(a + a3);
            
            double b = 3.14159;  // holds a decimal (negative or postive)
            System.out.println(a + b);
            
            boolean c = true;  // 'true' or 'false'
            
            char d = 'm';   // character (one letter, symbol, etc.)
            char e = '7';  //character representation of 7 (not actually 7)
            
            System.out.println(a + e);  // output: 59
            
            /* other variable types:
               long - really big int
               short - really small int
               float - a decimal, less precise than a double
               byte - don't worry about it 
               
            */
            
            /* YOU TRY:
               1. Make a class in Mimir
               2. Declare 2 variables (any type) and assign them a value
               3. Display them
               
               4. Make 2 int variables
               5. Display the sum 
               6. Display the product
               
            */
            
        }
}