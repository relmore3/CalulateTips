import java.util.Scanner;
public class CalculateTips {

	
  public static void main(String[] args) {
    
  // Create new Scanner object.
    Scanner input = new Scanner(System.in); 

  // Prompt the user to enter the subtotal and the gratuity rate
    System.out.print("Enter the subtotal and a gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();

  // Calculate gratuity and total
    double gratuity = subtotal * (gratuityRate / 100);
    double total = subtotal + gratuity;

  // Display results
    System.out.println("The gratuity is $" + gratuity +
    " and total is $" + total);
    input.close();
    }
  }
