for _ in range(int(input())):
	n=int(input())
	arr=list(map(int,input().split()))
	a=arr.copy()
	m=min(arr)
	a.sort()
	flag=0
	for i in range(len(arr)):
		if(a[i]!=arr[i]):
			if(arr[i]%m!=0):
				flag=-1
				break
	if(flag==-1):
		print("NO")
	else:
		print("YES")