def ok(a,b,x,y,n):
	if(b-y>=n):
		# print('yes')
		b-=n
		return a*b
	else:
		n-=(b-y)
		b=y
		# print(b)
		if(a-x>=n):
			# print('a yes')
			a-=n
			# print('a yes',a)
			return a*b
		else:
			a=x
			return a*b




for _ in range(int(input())):
	a,b,x,y,n=map(int,input().split())
	# print('ans')
	ans=min(ok(a,b,x,y,n),ok(b,a,y,x,n))
	print(ans)
