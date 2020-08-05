res=[]
for _ in range(int(input())):
	n=int(input())
	arr=list(map(int,input().split()))
	
	
	arr.sort()
	# a=arr.copy()

	if(n==1):
		res.append(0)
	elif(n==2):
		res.append(1)
	else:
		ans=0
		for t in range(2,101):
			i,j,temp=0,n-1,0
			while(i<j):
				if(arr[i]+arr[j]==t):
					temp+=1
					i+=1
					j-=1
				elif(arr[i]+arr[j]>t):
					j-=1
				else:
					i+=1
			ans=max(ans,temp)
		res.append(ans)
				

for i in res:
	print(i)

