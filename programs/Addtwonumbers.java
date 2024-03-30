
// Q. Add two numbers in Java 

package programs;

import java.util.Scanner;

public class Addtwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();
        System.out.println();
        int add = x + y;
        System.out.println("The addition of two numbers is : "+add);

    }
}

/*
 
Enter x : 5
Enter y : 5

The addition of two numbers is : 10

 */
