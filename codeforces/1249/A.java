import java.util.*;
import java.lang.*;
public class force{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);;
        int test=sc.nextInt();
        for(int t=test;t>0;t--){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i =0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int ans=0;
            for(int i=1;i<n;i++){
                if(Math.abs(arr[i-1]-arr[i])==1){
                    ans=2;
                }
            }
            if(ans==0){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }
        }



    }
}

