import java.util.Random;
import java.util.Scanner;


/*

Class: CSE 1321L
Section: J03
Term: Fall 2021
Instructor: Yamini Talluri
Name: Walker Burns
Lab#: Assignment5B

 */

public class Assignment5B {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("How many games do you want to play?: ");
        int rounds = scan.nextInt();

        int[] player = new int[rounds];
        int[] computer = new int[rounds];

        for (int i = 0; i<rounds;i++){

            System.out.print("What do you want to throw?: ");
            char temp = scan.next().toLowerCase().charAt(0);

            switch (temp){
                case 'r':
                    player[i] = 1;
                    break;
                case 'p':
                    player[i] = 2;
                    break;
                case 's':
                    player[i] = 3;
                default:
                    System.out.println("That is not a valid input, try again.");
                    i--;

            }

            computer[i] = rand.nextInt(3)+1;

            switch (computer[i]){
                case 1:
                    System.out.println("Computer threw ROCK!");
                    break;
                case 2:
                    System.out.println("Computer threw PAPER!");
                    break;
                case 3:
                    System.out.println("Computer threw SCISSORS!");
                    break;
            }

        }

        System.out.println("Game Over...\n");
        System.out.println("Here's the recap:");

        for (int i = 0;i<rounds;i++){
            if (computer[i] == player[i])
                System.out.println("Tied on round "+(i+1));
            else if (player[i] == 1)
                if (computer[i] == 2)
                    System.out.println("Computer won round "+(i+1));
                else
                    System.out.println("Player won round "+(i+1));
            else if (player[i] == 2)
                if (computer[i] == 3)
                    System.out.println("Computer won round "+(i+1));
                else
                    System.out.println("Player won round "+(i+1));
            else
                if (computer[i] == 1)
                    System.out.println("Computer won round "+(i+1));
                else
                    System.out.println("Player won round "+(i+1));
        }

    }

}
