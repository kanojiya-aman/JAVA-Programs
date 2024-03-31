package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedreaderInput {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        System.out.print("Enter the number : ");
        String name = String.valueOf(bf.readLine());
        System.out.println(name);
         

        //for taking integer as a input
        // Int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        //for taking long as a input
        // Long num = Long.parseLong(bf.readline());
        //System.out.println(num);

        
    }
}
