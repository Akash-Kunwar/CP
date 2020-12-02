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
        int n=nextInt();
        List<Integer> arr =new ArrayList<>();
        for(int i=0;i<n;i++)arr.add(nextInt());
        Collections.sort(arr);
        int max= arr.get(n-1),min=arr.get(0);
        arr.remove(0);
        arr.remove(n-2);
        
        out.print(max+" ");
        for(int i:arr)out.print(i+" ");
        out.print(min);
        out.close();
    }
}
