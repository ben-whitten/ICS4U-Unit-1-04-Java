/*
* The Microwave program implements an application that
* determines the time needed to reheat an item and quantity of which the user
* inputs.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-11-24 
*/

import java.util.Scanner;  // Import the Scanner class

public class Microwave {
  /**
   * This class is what calculates the time needed.
   */
  public static void main(String[] args) {
    //Constant for extra time per additional item.
    final double additionalTime = 0.5;
    
    double timeForOne = 0;
    double quantity = 0;

    try {
      // Create a Scanner object
      Scanner scan = new Scanner(System.in);

      
      System.out.println("Enter the item type you are reheating [sub]"
                         + " [pizza] [soup]:");
      String itemType = scan.nextLine();
        
      if (itemType.equals("sub")) {
        timeForOne = 1;
      } else if (itemType.equals("pizza")) {
        timeForOne = 0.75;
      } else if (itemType.equals("soup")) {
        timeForOne = 1.75;
      } else {
        System.out.println();
        System.out.println("You did not input a valid item type.");
        return;
      }
      
      System.out.println();
      System.out.println("Enter the quantity you are reheating [1-3]:");

      // Read user input (double = decimal number)
      Double quantityTemp = scan.nextDouble();
      quantity = quantityTemp;
        
      if ((quantity > 3) || (quantity < 1)) {
        System.out.println();
        System.out.println("You did not input a valid quantity.");
        return;
      }

      // Calculates the time.
      double time = (timeForOne + 0.5 * timeForOne * (quantity - 1));

      // Prints out the answer (with proper punctuation).
      if (quantity == 1) {
        System.out.println();
        System.out.println();
        System.out.println("The item needs:");
        if (time == 1) {
          System.out.println(time + " minute to reheat.");
        } else {
          System.out.println(time + " minutes to reheat.");
        }
      } else {
        System.out.println();
        System.out.println();
        System.out.println("The items need:");
        System.out.println(time + " minutes to reheat.");
      }

    // Catches "an error" and tells you one occured.
    } catch (Exception e) {
      System.out.println();
      System.out.println();
      System.out.println("An error occured.");
    }
  }
}
