// if-else
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 != 0) {
           System.out.println("Weird"); 
        } else if (N % 2 == 0 && 2 <= N && N <= 5) {
            System.out.println("Not Weird"); 
        } else if (N % 2 == 0 && 6 <= N && N <= 20) {
            System.out.println("Weird"); 
        } else {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}

// printin/printout with int, double(float in py), str(sentence type here)
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        
        // Write your code here.
        // scan.nextLine();
        Double d = scan.nextDouble();
        scan.nextLine(); // watch out this when you write the sentence as str type in java!
        String s = scan.nextLine(); // not next()
        
        scan.close();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    }
}

