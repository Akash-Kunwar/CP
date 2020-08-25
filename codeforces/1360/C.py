for _ in range(int(input())):
	n=int(input())
	arr=list(map(int,input().split()))
	arr.sort()
	even,odd=0,0
	for i in arr:
		if(i%2==0):
			even+=1
		else:
			odd+=1
	flag=False
	if(even%2==0 and odd%2==0):
		print("YES")
	else:
		for i in range(1,n):
			if(abs(arr[i]-arr[i-1])==1):
				flag=True
				break
		if(flag):
			print("YES")
		else:
			print("NO")

