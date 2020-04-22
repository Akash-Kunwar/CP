import java.util.*;
import java.lang.*;
public class force{
    public static void main(String[] args){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        char s[]=sc.nextLine().toCharArray();
        char t[]=sc.nextLine().toCharArray();
        for(int i=0;i<n;i++){
            if(s[i]!=t[i]){
                int pos=-1;
                for(int j=i+1;j<n;j++){
                    if(s[j]==t[i]){
                        pos=j;
                        break;
                    }
                }
                if(pos==-1){
                    System.out.println(-1);
                    return;
                }
                for(int j=pos-1;j>=i;j--){
                    char temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                    ans.add(j);
                    
                }

                
            }

        }
        System.out.println(ans.size());
        for(Integer i :ans){
            System.out.print((i+1)+" ");
        }
        return ;
        



    }
}

