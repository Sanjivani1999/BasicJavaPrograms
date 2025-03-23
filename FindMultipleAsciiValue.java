package PrintHello;

public class FindMultipleAsciiValue {
    public static void main(String[] args) {
         char [] charArrays = {'c','n','h','b','@'};
                for ( int i = 0; i< charArrays.length;i++)
                {
                    char userChar = charArrays[i]; //get the position at i
                    int asciiValue = (int) userChar;
                    System.out.println("The ASCII value of '" + userChar+"' is :" +asciiValue);

                }
    }
}
