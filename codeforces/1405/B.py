for _ in range(int(input())):
	n=int(input())
	arr=list(map(int,input().split()))

	ans=0

	for i in arr:
		ans+=i
		if(ans<0):
			ans=0
		# print(ans)
	print(ans)
