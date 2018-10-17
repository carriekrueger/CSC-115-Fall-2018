// Carrie Krueger 
// 10-17-18
// How to make random numbers in Java

import java.util.Random;   // using a premade Java class (Random)

public class RandomNumbers {
    public static void main(String[] args) {
        
        // HOW TO MAKE A RANDOM NUMBER USING THE RANDOM CLASS 
        
        // Step 1: Instantiate an object of Random (make an instance of the Random class)
        // This is not the random number, but what we will use to get the random number
        
        Random rand = new Random();
        
        // Step 2: use .nextInt(int) method to generate a random number in a range
        
        int randomNumber = rand.nextInt(100);     // gives a number 0-99
        
        //System.out.println(randomNumber);
        
        // How to generate a number between 1 and 100?
        
        System.out.println(rand.nextInt(101));  // gives a number 0-100
        
        System.out.println(rand.nextInt(100) + 1);
                                     // 0-99 + 1 = 1-100
                                     
        // How about a random number between 75-100?
        
        int randomNumber2 = rand.nextInt(26)  +  75;
                                      // 0-25 + 75 =75-100
                                      
                                      
        // Formula/Rule ????
        // Inside () --> number of random numbers you want (max # - min # + 1)
        // Add on outside --> starting number (minimum) you want
        
        // One more for good measure
        // Between 20 and 50?
        randomNumber2 = rand.nextInt(31) + 20;
                                //  0-30 + 20 = 20-50
        
    }
}
