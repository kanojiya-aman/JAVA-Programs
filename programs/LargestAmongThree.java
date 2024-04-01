package programs;

import java.util.Scanner;



public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();
        System.out.print("Enter z : ");
        int z = sc.nextInt();
       int result = Math.max(x, Math.max(y, z));
       System.out.println("The largest among three is : "+result);
    }
}


/*
 Enter x : 4
Enter y : 6
Enter z : 8
The largest among three is : 8
 */