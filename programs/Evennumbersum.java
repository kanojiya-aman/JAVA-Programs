package programs;

import java.util.Scanner;

public class Evennumbersum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int sum = n*(n + 1); // formula for sum of n even numbers
        System.out.println("The sum of first "+n+" even numbers is : "+ sum);
        sc.close();
    }
}

/*
 
Enter n : 3
The sum of first 3 even numbers is : 12

 */