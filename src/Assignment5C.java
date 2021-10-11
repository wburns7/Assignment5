import java.util.Scanner;


/*

Class: CSE 1321L
Section: J03
Term: Fall 2021
Instructor: Yamini Talluri
Name: Walker Burns
Lab#: Assignment5C

 */

public class Assignment5C {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("[FYE Level Map Creator]");
        System.out.print("Enter a level map width: ");
        int width = scan.nextInt();
        System.out.print("Enter a level map height: ");
        int height = scan.nextInt();

        char[][] map = new char[width][height];

        for (int h = 0;h < height;h++){

            for (int w = 0; w < width;w++){

                map[w][h] = '*';
                System.out.print("*");

            }

            System.out.println();

        }

        int menu = 0;

        while (menu != 4){

            System.out.print("Options\n" +
                    "1. Clear Level\n" +
                    "2. Add Platform\n" +
                    "3. Add Items\n" +
                    "4. Quit\n" +
                    "Enter a choice: ");
            menu = scan.nextInt();

            System.out.println();

            int x;
            int y;

            switch (menu){

                case 1:
                    System.out.println("[Clear Level]");
                    for (int h = 0;h < height;h++){
                        for (int w = 0; w < width;w++){
                            map[w][h] = '*';
                        }
                    }
                    break;

                case 2:
                    System.out.println("[Add Platform]");
                    System.out.print("Enter X Coordinate: ");
                    x = scan.nextInt();
                    System.out.print("Enter Y Coordinate: ");
                    y = scan.nextInt();
                    System.out.print("Enter Length: ");
                    int length = scan.nextInt();
                    if (y >= height || (x+length) >= width){
                        System.out.println("This platform won't fit in the level!");
                        break;
                    }
                    for (int i = 0;i<length;i++){
                        map[x+i][y] = '=';
                    }
                    break;
                case 3:
                    System.out.println("[Add Item]");
                    System.out.print("Enter X Coordinate: ");
                    x = scan.nextInt();
                    System.out.print("Enter Y Coordinate: ");
                    y = scan.nextInt();
                    if (y >= height || x >= width){
                        System.out.println("This is not a valid location!");
                        break;
                    }
                    map[x][y] = 'O';



            }

            for (int h = 0;h<height;h++){

                for (int w = 0;w<width;w++){

                    System.out.print(map[w][h]);

                }

                System.out.println();

            }
            System.out.println();

        }

        System.out.print("Goodbye!");


    }

}
