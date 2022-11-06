// This is hackerrank website practice question for java - java 7 version
// 1. java print
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}

// 2. java stdin & stdout
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // Complete this line - You can change the type of data from string to int
        String s = scan.next();        
        // Complete this line
        int a1 = scan.nextInt();
        scan.close();

        System.out.println(a);
        // Complete this line
        System.out.println(s);
        // Complete this line
        System.out.println(a1);
    }
}
