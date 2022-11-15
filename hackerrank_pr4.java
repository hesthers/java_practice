// print loop with printing all in one line and seperating each line
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int total = a;
            for(int j=0;j<n;j++){
                total += (int)Math.pow(2, j) * b; 
                System.out.print(total+" ");
            }
        System.out.println();
        }
        
        // println: change the line
        // print: print all in one line
        
        in.close();
    }
}

