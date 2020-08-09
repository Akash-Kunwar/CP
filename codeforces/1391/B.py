for _ in range(int(input())):
	n,m=map(int,input().split())	
	a=[]
	count=0
	for i in range(n):
		temp=list(input())
		a.append(temp)

	for i in range(n-1):
		if(a[i][-1]!='D'):
			count+=1
	for i in range(m-1):
		if(a[-1][i]!='R'):
			count+=1
	print(count)



