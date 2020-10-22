import java.util.*;
import java.io.*;
import java.lang.*;
public class Codeforces{
    BufferedReader br;
    PrintWriter out ;
    Codeforces() throws Exception{
        br =new BufferedReader(new FileReader("input.txt"));
        out = new PrintWriter(new File("output.txt"));  
    }
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
    public static void main(String[] args) throws Exception {
        new Codeforces().solve();
    }
    int ok(int arr[],int t,int start){
        int low=start,high=arr.length-1,idx=Math.min(start,high-1);
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>t){
                high=mid-1;
            }
            else{
                idx=mid;
                low=mid+1;
            }
        } 

        return idx;
    }
    void solve(){
        int n=nextInt();
        int arr[] =new int[n],res=0;
        for(int i=0;i<n;i++) arr[i]=nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int idx=ok(arr,arr[i]*2,i+1);
            res=Math.max(res,idx-i+1);
        }
        out.println(n-res);
        out.close();
    }
}
