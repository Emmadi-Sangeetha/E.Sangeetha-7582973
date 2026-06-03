import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess Number: ");
            guess = sc.nextInt();

            if(guess < target)
                System.out.println("Too Low");
            else if(guess > target)
                System.out.println("Too High");

        } while(guess != target);

        System.out.println("Correct!");

        sc.close();
    }
}