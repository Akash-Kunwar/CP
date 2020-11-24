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
            int n=nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)arr[i]=nextInt();
            TreeMap<Integer,List<Integer>> map=new TreeMap<>();
            for(int i=0;i<n;i++){
                if(map.containsKey(arr[i])){
                    map.get(arr[i]).add(i+1);
                }
                else{
                    List<Integer> temp=new ArrayList<>();
                    temp.add(i+1);
                    map.put(arr[i],temp);
                }
            }
            // out.println(map);
            boolean flag=false;
            for(int i:map.keySet()){
                if(map.get(i).size()==1){
                    out.println(map.get(i).get(0));
                    flag=true;
                    break;
                }
            }
            if(!flag)out.println(-1);
        }
        out.close();
    }
}
