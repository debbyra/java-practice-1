// program to find the largest of three numbers
public class Num2 {
    public static void main(String[] args) {
        int x, y, z;
        x = 5;
        y = 8;
        z = 9;
        // ternary operator to compare the values
        int large = (y>x) ? y:x;
        System.out.println(" the bigger num is: " +large) ;
        int larger = (z>large) ? z:large;
        System.out.println(" the new value is: " +larger) ;

    }
}
