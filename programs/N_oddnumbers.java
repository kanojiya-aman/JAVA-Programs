package programs;

import java.util.Scanner;

public class N_oddnumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter n : ");
        int n  = sc.nextInt();
        for(int i=1; i<=n; i+=2){
            System.out.println(i);
        }
        sc.close();
    }
}

/*
 enter n : 20
1
3
5
7
9
11
13
15
17
19
 */
