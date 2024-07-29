import java.util.Scanner;
import java.util.Random;

/*TODO:
 * Constructor to initialize values (COMPLETE)
 * Method to take user input (COMPLETE)
 * Check if correct number and ask the user to guess (COMPLETE)
 * Create a file to store best score and some basic stats (DO WHEN FILE READING IS COMPLETE)
 */



class GuessingNumber{
enum difficultyLevel{
        EASY,
        HARD
}
private int generatedNumber;
private int numberOfGuesses;
private int userInput;
private difficultyLevel difficulty;

GuessingNumber()
{
    Random r = new Random();
    this.generatedNumber = r.nextInt(0,101); //Limits : 0-101
    this.numberOfGuesses = 0;
    System.out.println("\nGuessTheNumber Game\n");
    while(true)
    {
        System.out.println("Choose difficulty:\n1:Easy\n2:Hard");
        try{
            Scanner d = new Scanner(System.in);
            int choice = d.nextInt();
            if(choice == 1)
            {
                this.difficulty=difficultyLevel.EASY;
                break;
            }
            else if(choice == 2)
            {
                this.difficulty=difficultyLevel.HARD;
                break;
            }
            else
            {
                System.out.println("Please choose ONLY 1 OR 2");
            }
        }
        catch(Exception e)
        {
            System.out.println("Please choose ONLY 1 OR 2");
        }

    }

}

void takeUserInput()
{

        while(true)
        {
            try
            {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number:");
                this.userInput = s.nextInt();
                if(this.userInput<0 || this.userInput>100)
                {
                    System.out.println("Please choose a valid number between 0 to 100!");
                }
                else
                {
                    break;
                }
            }
            catch(Exception e)
            {
                System.out.println("Please choose a valid number between 0 to 100!");
            }

        }




}

boolean checkGuessedNumber()
{
    //win condition
    if(this.userInput == this.generatedNumber)
    {
        System.out.println("Correct guess!");
        System.out.println("Number of tries: "+numberOfGuesses);
        return true;
    }
    if(this.difficulty==difficultyLevel.EASY)
    {
        //Too low condition
        if(this.userInput < this.generatedNumber &&  this.generatedNumber - this.userInput >= 10)
        {
            System.out.println("Too Low");
            numberOfGuesses+=1;
        }

        //Too high condition
        else if(this.userInput > this.generatedNumber && this.userInput - this.generatedNumber >= 10 )
        {
            System.out.println("Too High");
            numberOfGuesses+=1;
        }

        //Low condition
        else if(this.userInput > this.generatedNumber)
        {
            System.out.println("High");
            numberOfGuesses+=1;
        }

        //High condition
        else if(this.userInput < this.generatedNumber)
        {
            System.out.println("Low");
            numberOfGuesses+=1;
        }

    }
    else{
        if(this.userInput > this.generatedNumber)
        {
            System.out.println("High");
            numberOfGuesses+=1;
        }

        else if(this.userInput < this.generatedNumber)
        {
            System.out.println("Low");
            numberOfGuesses+=1;
        }
    }
    //Control comes here if you have not won the game
    return false;
}

}
public class GuessTheNumber {
    public static void main(String[] args) {
        GuessingNumber g = new GuessingNumber();
        System.out.println("Computer has chosen a number..");
        while(true)
        {
            g.takeUserInput();
            if(g.checkGuessedNumber())
            {
                System.exit(1);
            }
        }
    }
}
