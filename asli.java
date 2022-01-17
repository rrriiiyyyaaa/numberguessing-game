import java.util.Scanner;
public class Main {
	//function:
	public static void
	guessingNumberGame()
	{
	    int min =1;
	    int max = 50;
		Scanner sc = new Scanner(System.in);
		// Generate the random number
		int orignumber =  (int)(Math.random()*(max-min+1)+min* Math.random());
		// Given K trials
		int K = 5;
		int i, guess;
 		System.out.println(orignumber); // (for cheating)
		System.out.println( "A number is chosen" + " between 1 to 50." + "Guess the number" + " within 5 trials.");
		// Iterate over K(5) Trials
		for (i = 0; i < K; i++) 
		 {
		      int k =5;
			System.out.println("Guess the number:");
			// Take input for guessing
			guess = sc.nextInt();
			// If the number is guessed
			if (orignumber == guess) {
				System.out.println("Congratulations!" + " You guessed the number." + "You pass in "+ (i+1)+ " trails.");
				break;
			}
			else if (orignumber > guess	&& i != K - 1) 
			{
				System.out.println( "The number is " + "greater than " + guess );
			}
			else if (orignumber < guess	&& i != K - 1) {
			    System.out.println("The number is" + " less than " + guess);
			}
			/*
			else if(i == 4) {
		    
			System.out.println( "You have exhausted " + k +" trials. You loose the game.");
			System.out.println("The number was " + orignumber);
		    }
		    */
		    else if(i == 4)
		    {
		        System.out.println("Again?");
		        
		        int l=5;
		        for (int j=0;j<l ;j++ ) 
		        {
		            
		            System.out.println("Guess the number:");
			// Take input for guessing
			guess = sc.nextInt();
			// If the number is guessed
			if (orignumber == guess) {
				System.out.println("Congratulations!" + " You guessed the number." + "You pass in "+ (i+j)+ " trails.");
				break;
			}
			else if (orignumber > guess	&& j != l - 1) 
			{
				System.out.println( "The number is " + "greater than " + guess );
			}
			else if (orignumber < guess	&& j != l - 1) {
			    System.out.println("The number is" + " less than " + guess);
			}
			else if(j == 4) {
		    
			System.out.println( "You have exhausted " + k +" trials. You loose the game.");
			System.out.println("The number was " + orignumber);
		    }
		        }
		    }
		}
		
		
		
		
		
        
	}
	// Driver Code
	public static void main(String arg[])
	{
		// Function Call
		guessingNumberGame();
	}
}
