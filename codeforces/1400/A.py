def Ok(n,arr):
	count=0
	res=""
	for i in range(n):
		res+=arr[i+count]
		count+=1

	return res





for _ in range(int(input())):
	n=int(input())
	arr=input()
	print(Ok(n,arr))