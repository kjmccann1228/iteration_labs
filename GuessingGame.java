package mccann.kurt;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by kurtmccann on 9/9/16.
 */
public class GuessingGame {
    int guessRangeUpperBound;
    int secretNumber;
    Prompt preTurnPrompt;
    int lastGuess;
    int tryCount;
    boolean hasWon = false;
    Prompt tooLowPrompt = new Prompt("Too low!");
    Prompt tooHighPrompt = new Prompt("Too high!");
    Prompt youWin = new Prompt("That's right, the secret number was " + this.secretNumber + ". YOU WIN!!!");
    Prompt repeatedGuess = new Prompt("You just guessed that number.");


    public void setUpperBound() {
        Prompt upperBoundRequest = new Prompt("Please select an integer as your upper bound: ");
        upperBoundRequest.getPrompt();
        UserIntInput upperBound = new UserIntInput();
        this.guessRangeUpperBound = upperBound.getUserInput();
        System.out.println("The upper bound you chose is " + this.guessRangeUpperBound);

    }

    public int getUpperBound() {
        return this.guessRangeUpperBound;
    }

    //Generate random integer between 0 and upperBound
    public void setSecretNumber(int upperBound) {
        Random rand = new Random();
        int secret = rand.nextInt(upperBound + 1);
        this.secretNumber = secret;
        System.out.println("The secret numbah is " + this.secretNumber);
        //preTurnPrompt.setPrompt("Please guess a number between 1 and " + this.guessRangeUpperBound);
    }

    public boolean checkIfWon()
    {
        return this.hasWon;
    }

    public int getSecretNumber() {
        return this.secretNumber;
    }

    public void addTryCount()
    {
        this.tryCount++;
    }

    public int getGuess() {
        // reTurnPrompt.getPrompt();
        System.out.print("Guess a number between 1 and " + this.guessRangeUpperBound + ": ");
        UserIntInput guess = new UserIntInput();
        int currentGuess = guess.getUserInput();
        return guess.getUserInput();
    }


    public void acknowledgeWin()
    {
        youWin.getPrompt();
        this.hasWon=true;
    }

    public void checkGuess(int userGuess) {
        this.addTryCount();
        if(tryCount > 1) {
            if(userGuess == lastGuess)
            {
                repeatedGuess.getPrompt();
                tryCount--; //Do not count this as a try
            }
        }
        if(userGuess == this.secretNumber) {
           this.acknowledgeWin();
        }
        else if(userGuess < this.secretNumber) {
            tooLowPrompt.getPrompt();
        }
        else if(userGuess > this.secretNumber) {
           tooHighPrompt.getPrompt();
        }


    }

    public static void main (String[] args) {
        Prompt welcome = new Prompt("Welcome to the game.");
        welcome.getPrompt();
        GuessingGame game = new GuessingGame();
        game.setUpperBound();
        int upperBound = game.getUpperBound();
        System.out.println("Yo dog, the upper bound is: " + game.getUpperBound() + "!");
        game.setSecretNumber(upperBound);
        /*if(game.checkIfWon() == true) {
            System.out.println("A");
        }
        else {
            System.out.*/
       // game.preTurnPrompt.getPrompt();
        //System.out.println(game.hasWon); TEST

        //System.out.println("Fact: I have won the game" + game.checkIfWon()); TEST
        while(!game.checkIfWon()) {
            int guess = game.getGuess();
            game.checkGuess(guess);
        }
    }
}
