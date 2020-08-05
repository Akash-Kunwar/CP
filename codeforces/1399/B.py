for _ in  range(int(input())):
	n=int(input())
	a=list(map(int,input().split()))
	b=list(map(int,input().split()))

	m1,m2=min(a),min(b)
	ans=0
	for i in range(n):
		t1=a[i]-m1
		t2=b[i]-m2
		ans+=max(t1,t2)

	print(ans)