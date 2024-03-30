
// Q. Odd Even Program in Java 

package programs;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println(n + " is a Even number");
            }
            else{
                System.out.println(n + " is a Odd number");
            }  
            System.out.print("do you wish to continue : y/n");
            choice = sc.next().charAt(0); //specifies the character at index zero
        }
        while(choice=='y' || choice == 'Y');
        sc.close();

    }
}
/*
 
Enter the number : 5
5 is a Odd number
do you wish to continue : y/ny
Enter the number : 4
4 is a Even number
do you wish to continue : y/n

 */
