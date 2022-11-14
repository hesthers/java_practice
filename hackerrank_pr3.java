// Print output

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            
	    for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String cols = String.format("%-15s", s1);
                String pad_str = String.format("%03d", x);
                
                System.out.println(cols + pad_str);
            
            }
            
            System.out.println("================================");
            sc.close();
    }
}


// Loops - print times table(multiple calculation)
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
	// I completed the code here!
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i=1; i<=10; i++) {
            System.out.println(String.format("%d x %d = %d", N, i, N*i));
        }

        bufferedReader.close();
    }
}


