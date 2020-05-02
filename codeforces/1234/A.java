import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
           int n=sc.nextInt();
           int arr[]=new int[n];
           int sum=0;
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
               sum+=arr[i];
           }
           if(sum%n==0){
               System.out.println(sum/n);
           }
           else{
               System.out.println((sum/n)+1);
           }
        }

	}
}