package PrintHello;

import java.util.Scanner;

public class ReverseNumberByInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers for print reverse order");
        int number = scanner.nextInt();
        int rev = 0;
        while(number>0){
            rev = rev *10+number%10;
            number = number/10;


            // here is logic  of program
            //suppose here is 1234 rev = 0
            // rev = rev *10 + number % 10;
            //rev = 0 *10+1234 % 10 = 0+4 = 4
            // number = 1234/10 = 123

        }
        System.out.println("the reverse String is :"+ rev);
        scanner.close();
    }
}
