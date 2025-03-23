package PrintHello;

import java.util.Scanner;

public class EvenOddByUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // in java we create object of scanner  for user Input
        System.out.print("Enter a number");

        int number = scanner.nextInt();// for read user input that,s Why we use scanner.nextInt()

        if(number % 2 == 0){
            System.out.println("the number is even"+number);
        }
        else {
            System.out.println("the Number is odd"+number);
        }
    }

}
