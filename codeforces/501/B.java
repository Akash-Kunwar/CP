import java.util.*;
import java.lang.*;
public class GFG{
    
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> hm=new HashMap<String,String>();
        ArrayList<String> ans= new ArrayList<String>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String string=sc.nextLine();
            String str[]=string.split(" ");
            hm.put(str[0],str[1]);
            if(!hm.containsValue(str[0]))
                ans.add(str[0]);

        }
        System.out.println(ans.size());
        for(String str :ans){
            String search=str;
            while(hm.containsKey(search)){
                search=hm.get(search);
            }
            System.out.println(str+" "+search);

        }
    }
}

