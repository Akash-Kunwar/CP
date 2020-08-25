for _ in range(int(input())):
	n,m=map(int,input().split())

	mini=min(n,m)
	maxi=max(n,m)
	temp=max(mini*2,maxi)
	print(temp*temp)