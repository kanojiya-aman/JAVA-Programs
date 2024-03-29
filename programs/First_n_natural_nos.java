package programs;

import java.util.Scanner;

public class First_n_natural_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int i;
        for(i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}

/*
 Enter n : 10
1
2
3
4
5
6
7
8
9
10
 */
