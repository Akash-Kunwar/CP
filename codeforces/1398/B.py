for _ in range(int(input())):
	arr=list(input())

	count=0

	st=[]

	for i in range(len(arr)):
		if(arr[i]=='1'):
			count+=1
		else:
			if(count!=0):
				st.append(count)
				count=0
	if(count!=0):
		st.append(count)
		count=0
	st=sorted(st,reverse=True)
	ans=0
	# print(st)
	for i in range(len(st)):
		if(i%2==0):
			ans+=st[i]
	print(ans)

