import java.util.*;
import java.io.*;
import java.lang.*;
public class codeforces{ 
    static boolean check(long n){
        char str[]=Long.toString(n).toCharArray();
        Set<Integer> set =new HashSet<>();
        for(char c:str) {
            if((c-'0')!=0){
                set.add(c-'0');
            }
        }
        for(int i:set){
            if(n%i!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = 1;
        t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong(),i=n;
            for(i=n;;i++){
                if(check(i)){
                    break;
                }
            }
            System.out.println(i);
        }
    }
}

