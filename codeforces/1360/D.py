import math
def Ok(n,k):
	s=[]
	l=[]

	for i in range(1,int(math.sqrt(n))+1):
		if(n%i==0):
			if(n/i==i):
				s.append(i)
			else:
				l.append(n//i)
				s.append(i)

		# print(s)
		# print(l)
	
	for j in l:
		if(k>=j):
			return n//j

	s.reverse()


	for j in s:
		if(k>=j):
			return n//j



	return 1

for _ in range(int(input())):
	n,k=map(int,input().split())
	print(Ok(n,k))
