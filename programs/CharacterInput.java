
// Q. Take string input from user and print the character at specified position


package programs;

import java.util.Scanner;

public class CharacterInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine(); // take string input from the user
        System.out.print("Enter the position: ");
        int n = sc.nextInt(); // take position input from the user

        // Check if the position is valid
        if (n >= 0 && n < str.length()) {
            char ch = str.charAt(n); // get character at specified position
            System.out.println("Character at position " + n + " is: " + ch);
        } else {
            System.out.println("Invalid position entered.");
        }
    }
}

/*
 Enter the String: Aman
Enter the position: 2
Character at position 2 is: a 
*/