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
            int  a =nextInt(),b=nextInt();
            char arr[]=next().toCharArray();
            List<Integer> v =new ArrayList<>();
            int start =-1 ,end=-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='1') {start=i;break;}
            }
            for(int j=arr.length-1;j>=0;j--){
                if(arr[j]=='1') {end=j;break;}
            }
            if(start==-1 && end==-1){
                out.println(0);
            }
            else{
                // out.println(start+" "+end);
                for(int i=0;i<arr.length;){
                    if(arr[i]=='0'){
                        int j=i;
                        while(j<arr.length && arr[j]==arr[i]) j++;
                        // out.println(i+" -> "+j);
                        if(i>start && j<=end){
                            v.add(j-i);
                        }
                        i=j;
                    }
                    else{
                        i++;
                    }
                }
                int count=v.size()+1;
                long res=0;
                for(int i:v){
                    if(b*i<=a){
                        res+=b*i;
                        count--;
                    }
                }
                out.println(res+a*count);
            }
        }
        out.close();
    }
}
