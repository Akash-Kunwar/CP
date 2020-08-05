for _ in range(int(input())):
	n=int(input())
	x=n*3
	ans=''
	ans+='9'*(x//4)
	ans+='8'*(n-(x//4))

	print(ans)