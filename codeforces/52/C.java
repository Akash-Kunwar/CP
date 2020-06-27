import java.io.*;
import java.util.*;
import java.lang.*;

public class Segment{
	public static void main(String args[]) throws Exception{

		Scanner sc= new Scanner(System.in);
		PrintWriter out= new PrintWriter(System.out);

		int n=sc.nextInt();

		SegmentTree st=new SegmentTree(1,n);




		
		for(int i=1;i<=n;i++) st.add(i,i,sc.nextInt());
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
			String [] line = sc.nextLine().split(" ");
			int l = Integer.parseInt(line[0])+1;
			int r = Integer.parseInt(line[1])+1;

			if (line.length == 2)
			{
				long res = Long.MAX_VALUE;
				if (l > r)
				{	res = Math.min(res,st.min(l,n));
					res = Math.min(res,st.min(1,r));
				} 
				else 
					res = Math.min(res,st.min(l, r));
				out.println(res);
			}
			else
			{
				int  val = Integer.parseInt(line[2]);
				if (l > r)
				{
					st.add(1, r, val);
					st.add(l, n, val);
				}
				else
					st.add(l, r, val);
			}
		}

		out.close();

	}
}

class SegmentTree {
		SegmentTree l=null,r=null;
		int lo,hi;
		long delta,min;
		
		SegmentTree(int lo, int hi) {
			this.lo=lo;
			this.hi=hi;
			delta=0L;
			min=0L;
			if(lo!=hi) {
				int m=(lo+hi)/2;
				l=new SegmentTree(lo,m);
				r=new SegmentTree(m+1,hi);
			}
		}
		
		void add(int nlo, int nhi, int add) {
			if(nlo<=lo&&hi<=nhi) {
				//covers entire interval
				delta+=add;
				return;
			}
			if(lo>nhi||hi<nlo) {
				//covers nothing
				return;
			}
			push();
			l.add(nlo,nhi,add);
			r.add(nlo,nhi,add);
			update();		
		}
		
		long min(int nlo, int nhi) {
			if(nlo<=lo&&hi<=nhi) {
				//covers entire interval
				return min+delta;
			}
			if(lo>nhi||hi<nlo) {
				//covers nothing
				return Long.MAX_VALUE;
			}
			push();
			long left=l.min(nlo,nhi);
			long right=r.min(nlo,nhi);
			update();
			
			return Math.min(left,right);
		}
		void update() {
			min=Math.min(l.min+l.delta,r.min+r.delta);
		}
		void push() {
			l.delta+=delta;
			r.delta+=delta;
			delta=0;
		}
}



