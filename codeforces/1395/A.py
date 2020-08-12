for _ in range(int(input())):
	arr=list(map(int,input().split()))
	f,flag=0,-1
	for i in range(4):
		if(arr[i]%2!=0):
			f+=1

	if(f==0 or f==1):
		print('YES')
	elif(f==2):
		print('NO')
	else:
		if 0 in arr[:3]:
			print('NO')
		else:
			print('YES') 


