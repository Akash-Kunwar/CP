for _ in range(int(input())):
	n=int(input())
	arr=list(input())
	res=[0]*n
	q1=[]
	q0=[]
	count=1
	res[0]=count
	if(arr[0]=='0'):
		q0.append(count)
	else:
		q1.append(count)
	for i in range(1,n):
		if(arr[i]=='0'):
			if(len(q1)==0):
				count+=1
				res[i]=count
				q0.append(count)
			else:
				res[i]=q1[-1]
				q0.append(q1[-1])
				q1.pop(-1)
		if(arr[i]=='1'):
			if(len(q0)==0):
				count+=1
				res[i]=count
				q1.append(count)
			else:
				res[i]=q0[-1]
				q1.append(q0[-1])
				q0.pop(-1)
			
	
	print(count)
	print(*res)

