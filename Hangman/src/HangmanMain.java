import java.util.Scanner;

public class HangmanMain {
	public static void main(String[] args) {
		System.out.println("Lets start the Game");
		
		String[] words = new String[] {"python","java","html","css","sql","reactjs","kotlin",};
		String randomword = words[(int) (Math.random()* words.length)];
		
		System.out.println("The word has "+ randomword.length() + " letters.");
		
		char[] letters = new char[randomword.length()];
		
		for (int i = 0; i< letters.length; i++) {
			letters[i] = '.';
		}
		
		int lives = 3;
		Scanner s = new Scanner(System.in);
		
		
		while (lives > 0) {
			System.out.print("Lives: ");
			
			for (int i = 0; i< lives; i++) {
				System.out.print("0");
			}
			
			System.out.println();
			
			System.out.println("Input: ");
			
			String input = s.nextLine();
			
			char letter = input.charAt(0);
			
			
			
			boolean isGuessCorrect = false;
			
			for (int i=0; i< randomword.length(); i++) {
				char l = randomword.charAt(i);
				
				if (l == letter) {
					letters[i] = l;
					isGuessCorrect = true;
				}
			}
			
			if (!isGuessCorrect) {
				lives = lives - 1;	
			}
			
			boolean isGameFinished = true;
			
			System.out.print("Word: ");
			
			
			for (int i = 0; i< letters.length; i++) {
				if (letters[i] == '.') {
				    isGameFinished = false;
				}
				
				System.out.print(letters[i]);
			}
			System.out.println();
			
			System.out.println("--------------------");
			
			if (isGameFinished) {
				System.out.println("You Won !");
				break;
			}
			
		}
		
		if (lives == 0) {
			System.out.println("You Lost ! The word was: " + randomword);
		
		}
		
		System.out.println("Exiting Game");
		}
	}


