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
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){ 
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),x=sc.nextInt();
            int arr[]=new int[n],brr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            for(int i=0;i<n;i++) brr[i]=sc.nextInt();
            Arrays.sort(arr);
            Arrays.sort(brr);
            boolean flag=false;
            for(int i=0,j=n-1;i<=j;i++,j--){
                int temp=brr[i];
                brr[i]=brr[j];
                brr[j]=temp;
            }
            for(int i=0;i<n;i++){
                if(arr[i]+brr[i]>x) flag=true;
            }
            out.println(flag?"No":"Yes");
        }
        out.close();
    }
}
