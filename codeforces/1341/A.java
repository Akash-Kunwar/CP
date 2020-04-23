import java.util.*;
import java.lang.*;
import java.io.*;

public class force {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(n*(a-b)>(c+d)){
                System.out.println("No");
            }
            else if(n*(a+b)<(c-d)){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
        
        
    }
}