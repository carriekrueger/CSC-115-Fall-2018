// Carrie Krueger
// 9-17-18
// More notes on Chapter 2 and Chapter 3 

public class MoreChapter2 {
    
    public static void main(String[] args) {
        
        //PUTTING IT ALL TOGETHER (and some other stuff)
        
        int numOfEggs;
        // This is an integer (whole number)
        // It is called 'numOfEggs'
        // It's value is ---
        
        // We say this variable is DECLARED but not ASSIGNED
        
        numOfEggs = 30;
        
        // Now we have assigned a value to 'numOfEggs'
        
        // int numOfEggs = 100;      //DECLARED and assigned
        
        System.out.println("Number of eggs: " + numOfEggs);
        
        System.out.println("Number of dozens of eggs: "+ (numOfEggs/12));
        
        // Note: this doesn't change the value of numOfEggs
        // Where's the decimail point??? Java math is weird....
        
        // Integer division: an int divided by an int is always an int
        // (even if it's not)
        // A double divided by an int or vice-versa will give a double
        // "Automatic Promotion": In mixed-mode arithmetic, the types will be promoted
        // to the least restrictive type
        
        System.out.println(5/2); // 2 
        System.out.println(5.0/2); //2.5
        System.out.println(5/2.0); //2.5
        System.out.println(5.0/2.0); //2.5
        
        int num1 = 60;
        int num2 = 50;
        
        System.out.println(num1/num2);
        System.out.println(1.0*num1/num2); //works, but not ideal...
        System.out.println( ((double)num1)/num2);  // the proper way:  CASTING
        // casting is when you turn one type of variable into another
        System.out.println((double)num1/num2);  // PEMDAS :)
        
    }
}