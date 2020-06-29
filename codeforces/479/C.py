arr=[]
for _ in range(int(input())):
	a,b=map(int,input().split())
	arr.append([a,b])
arr=sorted(arr,key = lambda item:item[0])
ans=min(arr[0])
# print(arr)	
for i in range(1,len(arr)):
	if(ans>arr[i][1]):
		if(arr[i-1][0]!=arr[i][0]):
			ans=arr[i][0]
	else:
		ans=arr[i][1]
print(ans)