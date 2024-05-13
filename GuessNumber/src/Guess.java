import java.util.*;
public class Guess {
	public static void main (String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int randomNumber = rand.nextInt(10) + 1;
		//System.out.println("Random Number is "+ randomNumber);
		
	int tryCount = 0;
	
	while(true) {	
		System.out.println("Guess the Number (1 - 10): ");
		
		
		int playerGuess = sc.nextInt();
		tryCount++;
		
		if (playerGuess == randomNumber){
			System.out.println("Correct ! You Win !");
			System.out.println("It took you "+ tryCount + " Attempts");
			break;
		}
		else if(randomNumber > playerGuess){
			System.out.println("Nope ! The Number is Higher. Guess Again");
		}
		else if(randomNumber < playerGuess){
			System.out.println("Nope ! The Number is Lower. Guess Again");
		}
	}	
	}
}