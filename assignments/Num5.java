// program to count the even and odd numbers in a digit
public class Num5 {
    public static void main(String[] args) {
        int num = 123456;
        // set the count of even and odd numbers
        int evenCounter = 0;
        int oddCounter = 0; 
        // looping through the digits
        while (num != 0) {
            int number = num % 10;
            if (number % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
            num /=10;
        }
        System.out.println("Number of even digits: " + evenCounter);
        System.out.println("Number of odd digits: " + oddCounter);
    }
}
