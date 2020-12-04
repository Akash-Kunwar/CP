import java.util.*;
import java.io.*;
import java.lang.*;
public class Codeforces{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
    PrintWriter out =new PrintWriter(System.out);
    StringTokenizer st =new StringTokenizer("");
    String next(){
        if(!st.hasMoreTokens()){
            try{
                st=new StringTokenizer(br.readLine());
            }
            catch(Exception e){

            }
        }
        return st.nextToken();
    }
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){ 
        int n = nextInt();
        long  a = nextLong(), b= nextLong(), k=nextLong();
        long arr[]=new long[n];

        for(int i=0;i<n;i++) arr[i]=nextLong();

        for(int i=0;i<n;i++){
            long curr=arr[i]%(a+b);
            if(curr==0){
                long temp=a,c=0;
                while(temp<(a+b)){
                    temp+=a;
                    c++;
                }

                arr[i]=c;
            }
            else if(curr<=a){
                arr[i]=0;
            }
            else{
                // out.println("Element "+arr[i]+" "+curr);
                long temp=curr,c=0;
                // while(temp<curr){
                //     temp+=a;
                //     c++;
                // }
                c=temp/a;
                if(temp%a==0)c--;
                arr[i]=c;
                // out.println(arr[i]);
            }
        }
        // out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int res=0;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>k)break;
            res++;
        }
        out.println(res);
        out.close();
    }
}
