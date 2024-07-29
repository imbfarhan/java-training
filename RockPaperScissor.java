import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Random randInt = new Random();
        int userChoice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock Paper Scissor Game!");

        //UPDATE: Adding scores
        int userScore = 0;
        int computerScore = 0;
        int tieScore = 0;

        while(true)
        {
            System.out.println("Enter your choice");
            System.out.println("1.Rock");
            System.out.println("2.Paper");
            System.out.println("3.Scissor");
            System.out.println("4.Exit");
            userChoice = sc.nextInt();
            int computerChoice = randInt.nextInt(0,4);

            switch(userChoice)
            {
                //User chose ROCK
                case 1:
                    //Computer chose ROCK
                    if(computerChoice==0)
                    {
                        System.out.println("Computer chose ROCK");
                        System.out.println("Its a TIE!");
                        tieScore++;
                    }
                    //Computer chose PAPER
                    else if(computerChoice==1)
                    {
                        System.out.println("Computer chose PAPER");
                        System.out.println("You LOST!");
                        computerScore++;
                    }
                    //Computer chose SCISSOR
                    else
                    {
                        System.out.println("Computer chose SCISSOR");
                        System.out.println("You WON!");
                        userScore++;
                    }
                break;

                //User chose PAPER
                case 2:
                {
                    //Computer chose ROCK
                    if(computerChoice==0)
                    {
                        System.out.println("Computer chose ROCK");
                        System.out.println("You WON!");
                        userScore++;
                    }
                    //Computer chose PAPER
                    else if(computerChoice==1)
                    {
                        System.out.println("Computer chose PAPER");
                        System.out.println("Its a TIE!");
                        tieScore++;
                    }
                    //Computer chose SCISSOR
                    else
                    {
                        System.out.println("Computer chose SCISSOR");
                        System.out.println("You LOST!");
                        computerScore++;

                    } 
                }
                
                break;

                //user chose SCISSORs
                case 3:
                {
                    //Computer chose ROCK
                    if(computerChoice==0)
                    {
                        System.out.println("Computer chose ROCK");
                        System.out.println("You LOST!");
                        computerScore++;
                    }
                    //Computer chose PAPER
                    else if(computerChoice==1)
                    {
                        System.out.println("Computer chose PAPER");
                        System.out.println("You WON!");
                        userScore++;
                    }
                    //Computer chose SCISSOR
                    else
                    {
                        System.out.println("Computer chose SCISSOR");
                        System.out.println("Its a TIE!");
                        tieScore++;
                    } 
                }
                break;

                case 4:
                {
                   System.out.println("\n--Game Finished--\n");
                   System.out.println("-Final Stats-");
                   System.out.println("Computer Score:"+computerScore);
                   System.out.println("User Score: "+userScore);
                   System.out.println("Ties: "+tieScore);
                   System.exit(1);
                }
                break;

                default: System.out.println("Enter a valid choice!\n");
                break;
            }

        }
    }
}
