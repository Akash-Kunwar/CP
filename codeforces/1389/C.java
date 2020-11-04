import java.util.Scanner;
 
public class er92c {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int tt=0;tt<t;tt++) {
			char[] a=scan.next().toCharArray();
			int n=a.length;
			
			int res=Integer.MAX_VALUE;
			
			for(char i='0';i<='9';i++) {
				for(char j='0';j<='9';j++) {
					char cur=i;
					int len=0;
					for(int x=0;x<n;x++) {
						if(a[x]==cur) {
							len++;
							if(cur==i) cur=j;
							else cur=i;
						}
					}
					if(i!=j) len-=len%2;
					res=Math.min(res,n-len);
				}
			}
			System.out.println(res);
		}
	}
}