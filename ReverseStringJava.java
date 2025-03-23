package PrintHello;

public class ReverseStringJava {
    public static void main(String[] args) {
          String  originalString = "banana is good for health"
                  ;
         String  reverseString = "";
           for (int i = originalString.length()-1 ;i>=0; i--){
                reverseString += originalString.charAt(i);
           }
        System.out.println("Original String is :"+ originalString);

        System.out.println("Reverse String is:"+ reverseString);
    }
}
