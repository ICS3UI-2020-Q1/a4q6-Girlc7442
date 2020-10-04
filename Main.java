import java.util.Scanner;

/**
 * Determines if a number is prime
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    System.out.println("Which number would you like to check?");
    int userNumber = input.nextInt();

    int count = 1;

    while(userNumber % count == 1){
      count = count + 1;
      if(count == userNumber){
        break;
      }
    }
    System.out.println(userNumber);
  }
}
