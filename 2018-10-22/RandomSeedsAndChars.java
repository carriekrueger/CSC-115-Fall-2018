// Carrie Krueger
// 10-22-18
// Random Seeds and Random Chars 

import java.util.Random;
import java.util.Scanner;

public class RandomSeedsAndChars {
    public static void main(String[] args) {
        
        // Seeding the random number generator
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a seed: ");
        int seed = sc.nextInt();
        
        Random rand = new Random(seed); //use the seed the user entered
        
        int rand1 = rand.nextInt(100);
        System.out.println("Random Number 1 = " + rand1); // use the same seed, get the same number!
        
        // 10-50
        int rand2 = rand.nextInt(41) + 10;
        System.out.println("Random Number 2 = " + rand2);
        
        // Random chars... ASCII values/table
        // Uppercase letter : 65-90
        // need to cast to a char
        
        int rand3 = rand.nextInt(26) + 65 ;
        System.out.println("Random Number 3 = " + rand3);
        char randomUppercase = (char)(rand3);
        System.out.println("Character = " + randomUppercase);
    }
}
