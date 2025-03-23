package PrintHello;

public class EvenOddNumberInArray {
    public static void main(String[] args) {


        int[] numbers = {2, 7, 8, 10, 4, 6};

        for (int n : numbers) {
            if (n % 2 == 0) {

                System.out.println("the Number is even"+n);

            }
            else {
                System.out.println("Number is Odd"+n);
            }

        }

    }
}

