import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            if(n==1)
                System.out.println("YES");
            else if(m==1)
                System.out.println("YES");
            else if(n==2 && m==2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }



    }
}