// program to count the number of digits in a number
public class Num4 {

    public static void main(String[] args) {
  
      int count = 0, num = 8759974;
  
      while (num != 0) {
        num /= 10;
        ++count;
      }
  
      System.out.println("Number of digits is: " + count);
    }
  }
// using a for loop
// public class Num4 {
//     public static void main(String[] args) {

//         int count = 0, num = 456743;
    
//         for (; num != 0; num /= 10, ++count) { // the for loop does not have a body so we write one statement as such.
//         }
    
//         System.out.println("Number of digits: " + count);
//       }
// }


// using a while loop

