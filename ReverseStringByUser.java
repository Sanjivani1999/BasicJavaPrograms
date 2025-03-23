package PrintHello;

import java.util.Scanner;

public class ReverseStringByUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The String Which You Want:");
        String originalString = scanner.nextLine();
        scanner.close();

        String reverseString = "" ;


        for (int i = originalString.length()-1;i>=0;i--){
            reverseString += originalString.charAt(i);
        }

        System.out.println("Original String is :"+originalString+ "\n"+ "reverseString is :"+ reverseString) ;
    }
}
