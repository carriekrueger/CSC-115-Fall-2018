//Carrie Krueger
//9-12-18
//Notes on Chapter 2 things

public class Chapter2 {
    
    public static void main(String[] args) {
        
        System.out.print("Hi");
        System.out.println("Hi");
        
        // ESCAPE CHARACTERS
        // special characters denoted with \
        
        // \n -> new line 
        
        System.out.print("Hello! \n\n\n\n");
        System.out.println("H\ni");
        
        // \t -> tab 
        System.out.println("Hello\tclass!");
        System.out.println("Hi\t\teveryone!");
         
         // \\ -> \
         System.out.println("\\");
         
        // \" -> "
        System.out.println("She said \"Java is the best language everrrrr \"");
        
        // \' -> '
        System.out.println("\'");
        
        // STRING  
        // A variable that can hold a bunch of characters (like, a word)
        // String is a class (note the uppercase), but we can use it like a primitive
        
        String firstName = "Grace";  //note the camelCase
        System.out.println(firstName);
        
        String age = "57";
        
        System.out.println(age+1);  //String concatenation fun
        System.out.println(age + 3 + 4);  //output:  5734
        System.out.println(3 + 4 + age);  //output:  757
    }
}