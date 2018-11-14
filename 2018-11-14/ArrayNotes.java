// Carrie Krueger
// 11-12-18
// All about arrays 

public class ArrayNotes {
    public static void main(String[] args) {
      
      
        /*
              0   1   2   3   4   5   6
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
            -----------------------------
        */ 
        
        // ARRAY RULES 
        // 1. You need to know the size of the array when you declare it 
        // 2. Once the size is set, you can't change it (you can't resize an array)
        // 3. Arrays can only hold one type of data at a time (all ints, all String, etc.)
        // 4. Arrays are indexed from 0 to length - 1   (ArrayOutOfBoundsException error)
        
        
        // Let's make an array to hold daily temperatures for a week
        
        int[] temps = new int[7];    //  DECLARE the array and set the length ([])
        
        /*
              0   1   2   3   4   5   6             positions 0 to length - 1
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |           inititally filled with 0s
            -----------------------------
        */ 
        
        
        // loading the array with values
        
        temps[0] = 29;
        temps[1] = 31;
        temps[2] = 41;
        temps[3] = 16;
        temps[4] = 30;
        temps[5] = 30;
        temps[6] = 30;
        
        /*
              0    1     2    3    4   5    6             
            ------------------------------------
            | 29 | 31 | 41 | 16 | 30 | 30 | 30 |           
            ------------------------------------
        */ 
        
        
        System.out.println(temps[3]); // 16
        
        double weekendAverage = (temps[0] + temps[1]) /2.0;
        System.out.println("Weekend average = " + weekendAverage);  //30.0
        
        temps[3] = 26;   // no output, changed a value
        
        
        /*
              0    1     2    3    4   5    6             
            ------------------------------------
            | 29 | 31 | 41 | 26 | 30 | 30 | 30 |           
            ------------------------------------
        */ 
        
        
        System.out.println(temps[3]);  // 26
        
        
        // An array for the monthly temperatures? Make an int array of size 30
        
        int[] monthlyTemps = new int[30];
        
        // print out the first element in the array - position 0
        
        System.out.println("First: " + temps[0]);  // 29
        
        // print out last element in this array - position 6 (seventh element)
        
        System.out.println("Seventh: " + temps[6]); // 30
        
        // Position 7?
        
        //System.out.println( temps[7]);  // ArrayIndexOutOfBoundsException  
        
        // always print out the last element -- position length - 1
        
        System.out.println("Last: " + temps[temps.length - 1]); // 30
        
        // how to print the entire array?
        
        System.out.println(temps);  // memory address
        
        // use a for loop to visit every element and print it out
        
        for(int i = 0; i < temps.length; i++) {
            System.out.print(temps[i] + " ");
        }
        
        System.out.println();  // so the next things prints on the next line
        
        
        
        // Arrays act like just like Strings!
        
        String s = "abcdefg";
        
        System.out.println(s.length());  //7
        // for Strings, length is a method, for arrays length is a variable 
        
        System.out.println(s.charAt(0)); // a
        System.out.println(s.charAt(6)); // g
        //System.out.println(s.charAt(7)); // StringIndexOutOfBoundsException error
        System.out.println(s.charAt(s.length()-1)); //g
        
        // sending an array as a parameter to a method
        
        printArray(temps);
        
    
    }
    
    // This method takes an array and prints it out
    public static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
