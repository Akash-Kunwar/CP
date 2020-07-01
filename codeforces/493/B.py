p1=[]
p2=[]
l=0
for _ in range(int(input())):
	a=int(input())
	if(a>0):
		p1.append(a)
	else:
		p2.append(-a)
	l=a

if(sum(p1)>sum(p2)):
	print('first')
elif(sum(p1)<sum(p2)):
	print('second')
else:
	if(p1==p2):
		if(l>0):
			print('first')
		else:
			print('second')
	else:
		i=0
		j=0
		# print(p1,p2)
		while(i<len(p1) and j<len(p2)):
			if(p1[i]>p2[j]):
				print('first')
				break
			elif(p2[j]>p1[i]):
				print('second')
				break
			i+=1
			j+=1