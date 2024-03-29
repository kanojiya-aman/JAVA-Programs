
// Q. Java program to print all Even numbers between 0 to N 

package programs;

import java.util.Scanner;

public class N_even_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n =  sc.nextInt();
        int i;
        for(i = 0; i<=n; i+=2){
            System.out.println(i);
        }
        sc.close();
    }
}

/*
 Enter n : 10
0
2
4
6
8
10
 */