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
        int t=nextInt();
        while(t-->0){
            int n =nextInt();
            Map<Integer,Integer> map =new HashMap<>();
            int arr[] =new int[n];
            for(int i=0;i<n;i++) arr[i]=nextInt();
            int res=n+1,j=0;
            for(int i=0;i<n && j<n;i++){
                while(j<n && !(map.containsKey(arr[j]) && map.get(arr[j])>0)){
                    map.put(arr[j],map.getOrDefault(arr[j],0)+1);
                    j++;
                }
                // out.println(i+" "+j);
                res=Math.min(res,j-i+1);
                map.put(arr[i],map.get(arr[i])-1);
            }
            out.println(res>n?"-1":res);
        }
        out.close();
    }
}
