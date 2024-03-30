package programs;

import java.util.Scanner;

public class oddnumbersum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int sum = n*n; // formula for sum of n odd numbers
        System.out.println("The sum of first "+n+" odd numbers is : "+  sum);
        sc.close();
    }
}

/*
 
Enter n : 5
The sum of first 5 odd numbers is : 25

 */