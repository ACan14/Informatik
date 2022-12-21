package KW49;

public class Aufgab249 {
	import java.util.Scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	


		
		    // Create a Scanner object to read user input
		    Scanner scanner = new Scanner(System.in);

		    // Choose a word for the user to guess
		    String word = "hangman";

		    // Create an array to store the letters that have been guessed
		    char[] guessedLetters = new char[26];
		    int numGuesses = 0;

		    // Create a char array to store the current state of the word
		    char[] currentWord = new char[word.length()];
		    for (int i = 0; i < currentWord.length; i++) {
		      currentWord[i] = '_';
		    }

		    // Keep playing the game until the user has won or lost
		    while (true) {
		      // Print the current state of the word
		      System.out.print("Current word: ");
		      for (char c : currentWord) {
		        System.out.print(c + " ");
		      }
		      System.out.println();

		      // Print the number of remaining guesses
		      int remainingGuesses = 6 - numGuesses;
		      System.out.println("Remaining guesses: " + remainingGuesses);

		      // Print the letters that have been guessed
		      System.out.print("Guessed letters: ");
		      for (char c : guessedLetters) {
		        if (c != 0) {
		          System.out.print(c + " ");
		        }
		      }
		      System.out.println();

		      // Prompt the user to enter a letter
		      System.out.print("Enter a letter: ");
		      char input = scanner.next().charAt(0);

		      // Check if the letter has already been guessed
		      boolean alreadyGuessed = false;
		      for (char c : guessedLetters) {
		        if (c == input) {
		          alreadyGuessed = true;
		          break;
		        }
		      }

		      if (alreadyGuessed) {
		        System.out.println("You have already guessed that letter. Try again.");
		        continue;
		      }

		      // Update the list of guessed letters
		      guessedLetters[numGuesses] = input;
		      numGuesses++;

		      // Check if the word contains the letter
		      boolean correctGuess = false;
		      for (int i = 0; i < word.length(); i++) {
		        if (word.charAt(i) == input) {
		          currentWord[i] = input;
		          correctGuess = true;
		        }
		      }

		      if (!correctGuess) {
		        System.out.println("Incorrect guess.");
		      }

		      // Check if the user has won
		      boolean won = true;
		      for (int i = 0; i < currentWord.length; i++) {
		        if (currentWord[i] == '_') {
		          won = false;
		          break;
		        }
		      }

		      if (won) {
		        System.out.println("Congratulations! You won!");
		        break;
		      }

		      // Check if the user has lost
		      if (numGuesses == 6) {
		        System.out.println("Sorry");

		      }  }  }
		
	


