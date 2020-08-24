q=[]
pat="abacaba"
def Count(s):
	count=0
	s=''.join(s)
	n=len(s)
	for i in range(len(s)):
		if(i+7<=n and s[i:i+7]==pat):
			count+=1
	return count;



	

def Solve():
	n=int(input())
	s=input()
	flag=-1
	for i in range(n):
		t_s=list(s)
		k=0
		for j in range(i,i+7):
			if(j<n and (t_s[j]=='?' or t_s[j]==pat[k])):
				t_s[j]=pat[k]
				k+=1
			else:
				break
		# print(t_s)
		if(Count(t_s)==1):
			q.append("YES")
			for l in range(n):
				if(t_s[l]=='?'):
					t_s[l]='z'
			q.append(''.join(t_s))
			flag=1
			break


	if(flag==-1):
		q.append("NO")


for _ in range(int(input())):
	Solve()
for i in q:
	print(i)