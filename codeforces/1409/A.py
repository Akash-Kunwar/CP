for _ in range(int(input())):
	n,m=map(int,input().split())

	x=abs(n-m)

	if(x%10==0):
		print(x//10)
	else:
		print(x//10+1)