import java.util.*;

public class helloWorld 
{
	public static void main(String[] args) 
	{		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		StringBuilder ans = new StringBuilder();
		if(n-m > 1 || 2*(n+1) < m)
			ans.append("-1");
		else  {
			int a = m - n - 1; 
			if(n > m) {
				ans.append("0");
				n--;
			}
			for(int i = 0; i < n; i++) {
				ans.append("1");
				if(i < a)
					ans.append("1");
				if(i != n)
					ans.append("0");
			}
			if(m != n)
				ans.append("1");
			if(m - 2*n == 2)
				ans.append("1");
		}
		
		System.out.println(ans);
		
		in.close();
	}
}
