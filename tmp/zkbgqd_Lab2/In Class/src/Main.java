import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int yourPlay, computerPlay;
            boolean keepPlaying = true;

            while (keepPlaying == true) {
                System.out.print("Enter your choice (1=Scissors, 2=Paper, 3=Rock): ");
                yourPlay = keyboard.nextInt();

                Random rand = new Random();

                computerPlay = rand.nextInt(3) + 1;

                switch (computerPlay) {
                    case 1:
                        System.out.println("Computer chose Scissors");
                        break;
                    case 2:
                        System.out.println("Computer chose Paper");
                        break;
                    case 3:
                        System.out.println("Computer chose Rock");
                        break;
                }

                if (yourPlay == computerPlay) {
                    System.out.println("Tie Game");
                } else if
                ((yourPlay == 1 && computerPlay == 2) ||
                                (yourPlay == 2 && computerPlay == 3) ||
                                (yourPlay == 3 && computerPlay == 1))
                    System.out.println("You Won");
                else
                    System.out.println("You Lost");

                System.out.print("Keep playing? (1 = yes 2 = no): ");
                int a = keyboard.nextInt();
                if (a == 2) {
                    keepPlaying = false;
                }

            }
    }
}