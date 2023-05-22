// program to find the factorial of a number
public class Num3 {
    public static void main(String args[]) {
        // declare the variables
        int i,factorial=1;
        int num=8;
        
      for(i=1;i<=num;i++){// condition to calculate the factorial
            factorial=factorial*i;
        }
      System.out.println("factorial of "+num+" is: "+factorial);
    }
}
