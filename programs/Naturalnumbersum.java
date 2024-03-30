
// Q. Sum of first N natural numbers in Java

package programs;

import java.util.Scanner;

public class Naturalnumbersum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int  n = sc.nextInt();
        int sum = (n*(n+1))/2; //formula for sum of first n natural numbers
        System.out.println("The sum of first "+n+ " natural numbers is : "+ sum);
    }
}
/*

 Enter n : 5
The sum of first 5 natural numbers is : 15 

 */
