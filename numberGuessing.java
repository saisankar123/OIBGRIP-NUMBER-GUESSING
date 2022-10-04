import java.util.Scanner;
public class numberGuessing {
    public static void main(String args[]) {
        int won = 0;
        int userNumber = 0;
        int attempts = 1;
        int GuessNumber = (int) (Math.random() * 99 + 1);
        //int GuessNumber = 45;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing  Game \nYou have to guess the Number To Win The Game \nYou have only 5 Attempts");
        System.out.print("Enter a guess number between 1 to 100\n");
        System.out.println("Select the level\n1.LEVEL 1- 3 attempts\n2.LEVEL 2- 5 attempts");
        int n = in.nextInt();
        switch (n) {
            case 1: int noattempts1 = 2;
                System.out.println("start entering the numbers!");
                do {
                    if (in.hasNextInt()) {
                        userNumber = in.nextInt();
                        if (userNumber == GuessNumber) {
                            System.out.println("YOUR ARE AMAZING !, Your Guess is Correct. You Win the Game!");
                            won = 1;
                            break;
                        } else if (userNumber < GuessNumber) {
                            System.out.println("Your Guess Number is greater then " + userNumber);
                            System.out.println("No of attempts left " + noattempts1--);
                        } else if (userNumber > GuessNumber) {
                            System.out.println("Your Guess Number is lesser than " + userNumber);
                            System.out.println("No of attempts left " + noattempts1--);
                        }
                        if (attempts == 3) {
                            System.out.println("You have reached the maximum no: of attempts. Try Again");
                            break;
                        }
                        attempts++;
                    } else {
                        System.out.println("Enter a Valid Integer Number");
                        break;
                    }
                } while (userNumber != GuessNumber);
                if (won == 1)
                    System.out.println("your score=" + (noattempts1* 2 + 2) + " out of 6");
                break;
                case 2: int noattempts2 = 4;
                System.out.println("start entering the numbers!");
            do {
                    if (in.hasNextInt()) {
                        userNumber = in.nextInt();
                        if (userNumber == GuessNumber) {
                            System.out.println("YOUR ARE AMAZING !, Your Guess is Correct. You Win the Game!");
                            won = 1;
                            break;
                        } else if (userNumber < GuessNumber) {
                            System.out.println("Your Guess Number is greater then " + userNumber);
                            System.out.println("No of attempts left " + noattempts2--);
                        } else if (userNumber > GuessNumber) {
                            System.out.println("Your Guess Number is lesser than " + userNumber);
                            System.out.println("No of attempts left " + noattempts2--);
                        }
                        if (attempts == 5) {
                            System.out.println("You have reached the maximum no: of attempts. Try Again");
                            break;
                        }
                        attempts++;
                    } else {
                        System.out.println("Enter a Valid Integer Number");
                        break;
                    }
                } while (userNumber != GuessNumber);
                if (won == 1)
                    System.out.println("your score=" + (noattempts2 * 2 + 2) + " out of 10");
                break;
            default:
                System.out.println("invalid choice!");
        }
    }
}