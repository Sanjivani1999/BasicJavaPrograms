package PrintHello;

import java.util.Scanner;

public class AsciiValueFromUser {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the chracater :");

         char userChar  = scanner.next().charAt(0); //this use for read first character input from user
        int asciiValue = (int) userChar;
        System.out.print("The ASCII value of '" + userChar +"' is " + asciiValue);
        scanner.close();
    }


}
