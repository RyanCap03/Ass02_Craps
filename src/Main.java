import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);


        int dieOff = rnd.nextInt(6);  // generates a random int between 0 and 5
        int die = rnd.nextInt(6) + 1; // generates a random int between 1 and 6 what we want for dice

        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2; // Gaussian range from 2 to 12 as in rolling two dice
        int sum = die1 + die2;

        String playAgain = "Y";

        while(playAgain.equalsIgnoreCase("Y"))
        {
            System.out.println(die1 + " + " + die2);
            System.out.println("you rolled: " + crapsRoll );


                if(playAgain.equalsIgnoreCase("y"))
                {
                    if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                        System.out.println("You Crapped Out! You Lose!");
                        playAgain = "N";
                    }
                    else if (crapsRoll == 7 || crapsRoll == 11)
                    {
                        System.out.println("Natural! You won with a roll of " + crapsRoll);
                        playAgain = "N";
                    }
                    else if (crapsRoll == 4 || crapsRoll == 5 || crapsRoll == 6 || crapsRoll == 8 || crapsRoll == 9 || crapsRoll == 10 || crapsRoll == 11)
                    {
                        System.out.println("You got a point! Get a 7 and lose or match " + crapsRoll + " to win!");
                        playAgain = "n";
                        if (crapsRoll == sum)
                        {

                            System.out.println("You rolled: " + sum);
                            System.out.println("You Won Craps!");
                        }
                        else
                        {
                            System.out.println("You Crapped Out! You Lose!");
                        }
                    }

                    System.out.print("would you like to play again? [Y/N]: ");
                    playAgain = in.nextLine();

                }
                else
                {
                    break;
                }

        }

    }
}