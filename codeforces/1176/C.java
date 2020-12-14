import java.util.*;
import java.io.*;
import java.lang.*;
public class Solution{
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
        new Solution().solve();
    }
    void solve(){ 
        int n = nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i] = nextInt();
        Map<Integer,Integer> map =new HashMap<>();
        map.put(4,0);
        map.put(8,0);
        map.put(15,0);
        map.put(16,0);
        map.put(23,0);
        map.put(42,0);

        for(int i:arr)
        {
            if(i==4) map.put(4,map.getOrDefault(4, 0)+1);
            else if(i==8){
                if(map.get(8)<map.get(4)){
                    map.put(8,map.getOrDefault(8, 0)+1);
                }
            }
            else if(i==15){
                if(map.get(15)<map.get(8)){
                    map.put(15,map.getOrDefault(15, 0)+1);
                }
            }
            else if(i==16){
                if(map.get(16)<map.get(15)){
                    map.put(16,map.getOrDefault(16, 0)+1);
                }
            }
            else if(i==23){
                if(map.get(23)<map.get(16)){
                    map.put(23,map.getOrDefault(23, 0)+1);
                }
            }
            else if(i==42){
                if(map.get(42)<map.get(23)){
                    map.put(42,map.getOrDefault(42, 0)+1);
                }
            }
        }
        int res=n;
        for(int i:map.keySet()){
            res=Math.min(res,map.get(i));
        }
        // out.println(map);
        out.println(n-res*6);
        out.close();
    }
}
