import java.util.*;
import java.io.*;
import java.lang.*;
public class Codeforces{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt(),m=sc.nextInt(),start=sc.nextInt(),end=sc.nextInt();
        Map<Integer,Pair> map=new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(sc.nextInt(),new Pair(sc.nextInt(),sc.nextInt()));
        }
        StringBuilder str =new StringBuilder();
        if(start<=end){
            int i=1;
            while(start<end){
                if(map.containsKey(i)){
                    Pair temp=map.get(i);
                    if((temp.a<=start && temp.b>=start) || (temp.a<=start+1 && temp.b>=start+1)){
                        str.append('X');
                    }
                    else{
                        start++;
                        str.append('R');
                    }
                }
                else{
                    start++;
                    str.append('R');
                }
                i++;
            }
        }
        else{
            int i=1;
            while(start>end){
                if(map.containsKey(i)){
                    Pair temp=map.get(i);
                    if((temp.a<=start && temp.b>=start) || (temp.a<=start-1 && temp.b>=start-1)){
                        str.append('X');
                    }
                    else{
                        start--;
                        str.append('L');
                    }
                }
                else{
                    start--;
                    str.append('L');
                }
                i++;
            }
        }
        out.println(str);
        out.close();
    }
}
class Pair{
    int a=0,b=0;
    Pair(int a ,int b){
        this.a=a;
        this.b=b;
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