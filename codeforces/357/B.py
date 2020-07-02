n,m=map(int,input().split())

ans=[-1]*(n+1)


for _ in range(m):

	dancers=list(map(int,input().split()))

	need=[1,2,3]

	for i in dancers:
		if(ans[i]!=-1):
			need.remove(ans[i])
	
	for i in dancers:
		if(ans[i]==-1):
			ans[i]=need.pop(-1)
	
print(*ans[1:])