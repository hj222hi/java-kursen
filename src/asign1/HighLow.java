package asign1;

/**
 * Created by Iamha on 2016-09-01.
 */

import java.util.Random;
import java.util.Scanner;


public class HighLow {
    public static void main(String[] args) throws NumberFormatException{

        try {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            int n = rand.nextInt (101);
            if(n%2 == 0){
                n--;
            }
            System.out.println("The number is randomized, make a guess!");


            for (int i = 1; i < 11 ; i++) {
                String str = sc.nextLine();
                int guessedNumber = Integer.parseInt(str);
                System.out.println("Guess"+i+": " + guessedNumber);
                if(guessedNumber > n){
                    System.out.println("Guess lower");
                }
                else if(guessedNumber < n){
                    System.out.println("Guess higher");
                }
                else{
                    System.out.println("Good Job you got it on guess number "+i);
                    break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("That's not a number");
        }

    }
}
