// Carrie Krueger
// 10-13-18
// All about while loops

public class WhileLoops {
    public static void main(String[] args) {
        
        // Ask a question once: if-else statement 
        // Ask a question repeatedly: loop (while loop)
        
        // LOOP RULES:
        
        // When you program a loop, you should know that it DEFINITELY will end
        
        // Usually, you will have to increment some variable so that the loop will approach
        // the end state  (loop control variable)
        
        // Put curly braces { } around the while loop code!!!
        
        // If a loop encounters a 'break', it immediately stops running
        
        // WAYS TO INCREMENT A VARIABLE:
        
        // int counter = 0;
        // How to add 1 to counter?
        // counter = counter + 1;
        // counter += 1;    // shorter!  (accumulator)
        // counter++;   // another common way to increment 
        
        // HERE COMES A LOOP
        
        int counter = 0;
        
        while(counter != 5) {
            
            counter +=1;   // increment
            System.out.println(counter);
            
            // if(<some condition>) {     // don't use breaks too often... 
            //    break;
            //}
        }
        
        int num = 0;
        
        while(num < 3) {
            
            System.out.println(num);
        }
        // INFINITE LOOP OF DOOM    
        // Close your terminal window to escape...
        
    }
}
