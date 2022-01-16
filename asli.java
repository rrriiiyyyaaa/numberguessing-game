import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int random, guess, attempts;
       
        Random rand = new Random();
        random = rand.nextInt(100) + 1;
        attempts = 0; 
        int ntg = rand.nextInt(100);
        System.out.println("Guess a no. between 1 to 100, what I'm thinking of: ");
        for (int i=0;i<5 ;i++ ) {
        
        Scanner sc = new Scanner(System.in);
        guess = sc.nextInt(); 
          
            if (random == guess) {
                System.out.print("You guessed right!");
                attempts += 1; 
            }
            else if (guess<random) {
                System.out.print("Lower!");
                attempts +=1;
            }
            else if(guess >random)
            {
                System.out.println("Higher!");
            }
          }

        System.out.println(random + " is the correct answer and it took you" + attempts + " attempts to guess it!");
    }        
}
