// program to swap numbers
public class Num1 {
    public static void main(String[] args) {
        // declare the varibles
        int x, y, t;
        // assign values
        x = 3;
        y = 2;
        System.out.println("Before swapping: "+ x +" "+ y);   
        // swapping the numbers
        t = x;
        x = y;
        y = t;
        System.out.println("After swapping: "+ x + " "+ y);      
    }
};