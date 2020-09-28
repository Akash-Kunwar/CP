import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        Map<Integer,List<Integer>> arr =new HashMap<>();
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(arr.containsKey(x)){
                if(arr.get(x).size()==2){
                    int f=arr.get(x).get(0),s=arr.get(x).get(1);
                    if(s-f==i-s){
                        arr.get(x).set(0,s);
                        arr.get(x).set(1,i);
                    }
                    else{
                        count--;
                        arr.get(x).remove(1);
                        arr.get(x).set(0,-1);
                    }
                }
                else if(arr.get(x).get(0)==-1){
                    continue;
                }
                else{
                    arr.get(x).add(i);
                }
            }
            else{
                List<Integer> temp=new ArrayList<>();
                temp.add(i);
                arr.put(x,temp);
                count++;
            }
        }
        out.println(count);
        List<Integer> st=new ArrayList<>();
        for(int i:arr.keySet()) st.add(i);
        Collections.sort(st);
        for(int i:st){
            if(arr.get(i).size()==2){
                out.println(i+" "+(arr.get(i).get(1)-arr.get(i).get(0)));
            }
            else if(arr.get(i).get(0)!=-1){
                out.println(i+" "+0);
            }
        }
        out.close();
    }
}

class FastScanner{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
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
}