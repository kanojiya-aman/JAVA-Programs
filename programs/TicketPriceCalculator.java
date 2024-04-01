
/*Ticket Price Calculator: Write a program that asks the user for their age and whether they are a student or not. Based on this information, calculate and print the ticket price for a movie. Ticket prices are as follows:

If age is below 12 or above 65, ticket price is $5.
If age is between 12 and 18, and the user is a student, ticket price is $7.
For all other cases, ticket price is $10.*/

package programs;

import java.util.Scanner;

public class TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        
        do {
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline character
            
            System.out.println("Are you a student? (y/n): ");
            char studentResponse = sc.nextLine().charAt(0);
            
            int ticketPrice;
            if (age < 12 || age > 65) {
                ticketPrice = 5;
            } else if (age >= 12 && age <= 18 && studentResponse == 'y') {
                ticketPrice = 7;
            } else {
                ticketPrice = 10;
            }
            
            System.out.println("Your ticket price is: $" + ticketPrice);

            System.out.println("Do you want to continue? (y/n): ");
            choice = sc.nextLine().charAt(0);
        } while (choice == 'y');

        sc.close();
    }
}
