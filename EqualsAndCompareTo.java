import java.util.Scanner;

/**
 * This program demonstrates the equals and compareTo String methods as well
 * as their case insensitive counterparts, equalsIgnoreCase and compareToIgnoreCase
 */

public class EqualsAndCompareTo
{
  public static void main(String[] args)
  {
    // Declare variables
    Scanner keyboard = new Scanner(System.in);
    String name1;
    String name2;
    
    
    // Prompt the user for the first name.
    System.out.println("Please enter a name.");
    name1 = keyboard.nextLine();
    
    // Consume the next line
    // keyboard.nextLine();
    
    // Prompt the user for the second name.
    System.out.println("Enter the second name.");
    name2 = keyboard.nextLine();
    
    // Compare the two names.
    if (name1.equals(name2))
      System.out.println("The names are the same.");
    else
      System.out.println("The names are not the same.");
      
    // Using the compareTo method, compare the names
    if (name1.compareTo(name2) < 0)
      System.out.println(name1 + " is less than " + name2 + ".");
    else if (name1.compareTo(name2) == 0)
      System.out.println(name1 + " is equal to " + name2 + ".");
    
    // The statement after the below IF needs to be removed if the line
    // just reads ELSE
    else if (name1.compareTo(name2) > 0)
      System.out.println(name1 + " is greater than " + name2 + ".");
    
    // Using the case insensitive method equalsIgnoreCase, compare the names.
    if (name1.equalsIgnoreCase(name2))
      System.out.println("Using the \'equalsIgnoreCase\' method and case being " +
                         "ignored, " + name1 + " equals " + name2 + ".");
    else
      System.out.println("Using the \'equalsIgnoreCase\' method, the names " +
                         name1 + " and " + name2 + " are not equal.");
    
    // Using the case insensitive method compareToIgnoreCase, compare the names.
    if (name1.compareToIgnoreCase(name2) > 0)
      System.out.println("Using the case insensitive \'compareToIgnoreCase\' method, " +
                         name1 + " is greater than " + name2 + ".");
    else if (name1.compareToIgnoreCase(name2) == 0)
      System.out.println("Using the case insensitive \'compareToIgnoreCase\' method, " +
                         name1 + " and " + name2 + " are equal.");
    else if (name1.compareToIgnoreCase(name2) < 0)
      System.out.println("Using the case insensitive \'compareToIgnoreCase\' method, " +
                         name1 + " is less than " + name2 + ".");
    
  }
}
