import java.util.*;
import java.lang.*;
import java.io.*;

public class force {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        while(t-->0){
            int i=1;
            while(i<n){
                if(arr[i-1] =='B' && arr[i]=='G'){
                    char temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                    i++;
                }
                i+=1;
            }
        }
        for(char s:arr){
            System.out.print(s);
        }
        // System.out.println();
        
    }
}