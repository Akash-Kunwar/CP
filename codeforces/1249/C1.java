import java.util.*;
import java.lang.*;
public class force{
    public static long power(long x,long n){
        long result=1;
        int MOD =1000000009;
        while(n>0){
            if((n&1)==1)
                result=result * x % MOD;
            n=n/2;
            x=x * x % MOD;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Long arr[]=new Long[40];
        long s=0,sum=0;
        for(int i=0;i<40;i++){
            arr[i]=power(3,i);
            s+=arr[i];
        }
        // System.out.println(Arrays.toString(arr));
        Collections.reverse(Arrays.asList(arr));
        // System.out.println(Arrays.toString(arr));
        int test=sc.nextInt();
        while(test-->0){
            sum=s;
            long n =sc.nextInt();
            for(int i=0;i<40;i++){
                if(sum-arr[i]>=n)
                    sum-=arr[i];
            }
            System.out.println(sum);
        }




    }
}

