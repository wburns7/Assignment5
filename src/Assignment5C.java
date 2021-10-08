import java.util.Scanner;

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
                    int x = scan.nextInt();
                    System.out.print("Enter Y Coordinate: ");
                    int y = scan.nextInt();
                    System.out.print("Enter Length: ");
                    int length = scan.nextInt();
                    for (int i = 0;i<length;i++){
                        map[x+i][y] = '=';
                    }
                    break;
                case 3:



            }

            for (int h = 0;h<height;h++){

                for (int w = 0;w<width;w++){

                    System.out.print(map[w][h]);

                }

                System.out.println();

            }

        }

        System.out.print("Goodbye!");


    }

}
