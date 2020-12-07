import java.util.*;
public class cf{
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long d=sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
	TreeSet<Long> photo=new TreeSet<>();
	HashMap<Long,HashSet<Integer>> g=new HashMap<>();
	HashSet<Integer> ans=new HashSet<>();
	for(int i=0;i<n;i++){
	    long z=(a*sc.nextLong())+(b*sc.nextLong());
	    photo.add(z);
	    if(!g.containsKey(z))g.put(z,new HashSet<>());
	    g.get(z).add(i+1);
	}
	for(long y:photo){
	    if(y>d)break;
	    for(int x:g.get(y)){
		ans.add(x);
		d-=y;
		if(d<y)break;
	    }
	}
	System.out.println(ans.size());
	for(int x:ans)System.out.print(x+" ");
    }
}