import java.util.*;
import java.lang.Math;
public class force{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        while(--test>=0){

            String str=sc.nextLine();
            int curr=-1,max=-1;
            int i;
            int n=str.length();
            for(i=0;i<n;i++){
                if(str.charAt(i)=='R'){
                    max=Math.max(max,i-curr);
                    curr=i;
                }
                // System.out.println(max);
            }
            curr=n;
            for(i=n-1;i>=0;i--){
                if(str.charAt(i)=='R'){
                    max=Math.max(max,curr-i);
                    curr=i;
                }
                // System.out.println(max);
            }
            if(max==-1){
                System.out.println(n+1);
            }
            else{
                System.out.println(max);
            }
            
        }
    }
}