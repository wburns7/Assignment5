import java.util.Random;
import java.util.Scanner;

/*

Class: CSE 1321L
Section: J03
Term: Fall 2021
Instructor: Yamini Talluri
Name: Walker Burns
Lab#: Assignment5A

 */

public class Assignment5A {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("What's the highest number you want to generate?: ");
        int max = scan.nextInt();
        System.out.print("How long of a number sequence do you want to generate?: ");
        int length = scan.nextInt();
        System.out.println("Okay, we'll generate "+length+" number(s) ranging from 1 to "+max+"!");

        int[] random = new int[length];
        double[] count = new double[max];

        for (int i = 0; i<length;i++){

            random[i] =(rand.nextInt(max)+1);
            System.out.print(random[i]+", ");

        }

        for (int i = 1; i<= max;i++){

            count[i-1] = 0;

            for (int j = 0;j<length;j++){

                if (random[j] == i)
                    count[i-1]++;

            }

        }

        System.out.println("\nFrequency:");

        for (int i = 1; i<=max;i++){

            System.out.print(i+" occurs ");
            System.out.printf("%.2f",((count[i-1]/length))*100);
            System.out.println("% of the time");

        }




    }

}
