import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n*(n+1)/2;
        if(x%2!=0)
            System.out.println(1);
        else
            System.out.println(0);

    }
}