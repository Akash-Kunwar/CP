import java.util.*;
import java.io.*;
import java.lang.*;
public class Codeforces{
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    
    void solve(){ 
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            Map<Integer,Set<Integer>> m=new TreeMap<>();
            for(int i=0;i<n;i++){
                if(m.containsKey(arr[i])){
                    m.get(arr[i]).add(i);
                }
                else{
                    Set<Integer> temp=new HashSet<>();
                    temp.add(i);
                    m.put(arr[i],temp);
                }
            }
            if(m.size()==1){
                System.out.println(0);
            }
            else{
                int result=Integer.MAX_VALUE;
                // out.println(freq);
                for(int i:arr){
                    int r=0;
                    int prev=-1;
                    for(int j:m.get(i)){
                        if(j!=(prev+1)){
                            r++;
                        }
                        prev=j;
                    }
                    if(prev!=n-1)r++; 
                    result=Math.min(r,result);
                }
                System.out.println(result);
            }
            
        }
    }
}
