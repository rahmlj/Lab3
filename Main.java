
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner t = new Scanner(System.in);

    int number;
    System.out.println("Enter a number to count down or up from: ");
    number = t.nextInt();
    if (number >= 0)
        while(number > 0)
        {
          number --;
          System.out.println(number);
          
        }
    else if(number <= 0)
      while (number < 0)
      {
        number ++;
        System.out.println(number);
        
      }
          System.out.println("Blast Off!");
    
  }
}