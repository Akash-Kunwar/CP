import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        List<Pair> arr=new ArrayList<>();
        int maxP=-1,maxT=-1,maxG=-1;
        while(n-->0){
            int k=sc.nextInt();
            String name=sc.next();
            int t=0,g=0,p=0;
            for(int i=0;i<k;i++){
                String phone =sc.next();
                int temp[]=new int[6];
                int l=0;
                for(int j=0;j<8;j++){
                    if(phone.charAt(j)=='-') continue;
                    temp[l]=phone.charAt(j)-'0';
                    l++;
                }
                boolean allSame=true,Sorted=true;
                // out.println(Arrays.toString(temp));
                for(int j=1;j<l;j++){
                    if(temp[j]!=temp[j-1]) {
                        allSame=false;
                    }
                    if(temp[j]>=temp[j-1]){
                        Sorted=false;
                    }
                }
                if(allSame){
                    t++;
                }
                else if(Sorted){
                    p++;
                }
                else{
                    g++;
                }
            }
            arr.add(new Pair(name,t,g,p));
            if(maxT<t){
                maxT=t;
            }
            if(maxG<g){
                maxG=g;
            }
            if(maxP<p){
                maxP=p;
            }
        }
        // for(Pair p:arr){
        //     out.println(p.name+" "+p.t+" "+p.p+" "+p.g);
        // }
        List<String> res=new ArrayList<>();
        for(Pair p:arr){
            if(p.t==maxT){
                res.add(p.name);
            }
        }
        StringBuilder ans=new StringBuilder();
        ans.append("If you want to call a taxi, you should call:");
        for(String r:res){
            ans.append(" "+r+",");
        }
        ans.setCharAt(ans.length()-1, '.');
        ans.append("\n");
        res.clear();
        for(Pair p:arr){
            if(p.p==maxP){
                res.add(p.name);
            }
        }
        ans.append("If you want to order a pizza, you should call:");
        for(String r:res){
            ans.append(" "+r+",");
        }
        ans.setCharAt(ans.length()-1, '.');
        ans.append("\n");
        res.clear();
        for(Pair p:arr){
            if(p.g==maxG){
                res.add(p.name);
            }
        }
        ans.append("If you want to go to a cafe with a wonderful girl, you should call:");
        for(String r:res){
            ans.append(" "+r+",");
        }
        ans.setCharAt(ans.length()-1, '.');
        ans.append("\n");
        out.println(ans);
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
class Pair{
    String name="";
    int t=0,g=0,p=0;
    Pair(String name,int t,int g,int p){
        this.name=name;
        this.t=t;
        this.p=p;
        this.g=g;
    }
}