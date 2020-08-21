for _ in range(int(input())):
	x,y,z=map(int,input().split())
	a,b,c=map(int,input().split())

	temp=min(z,b)

	ans=temp*2
	z-=temp
	b-=temp


	temp=min(y,a)
	y-=temp
	a-=temp
	
	temp=min(x,c)
	x-=temp
	c-=temp
	
	print(ans-2*min(y,c))

