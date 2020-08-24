n=int(input())
arr=list(map(int,input().split()))

min_idx,max_idx=-1,-1
mini,maxi=101,-1

for i in range(n):
	if(mini>=arr[i]):
		min_idx=i
		mini=arr[i]
	if(maxi<arr[i]):
		max_idx=i
		maxi=arr[i]
if(min_idx>max_idx):
	ans=(n-min_idx-1)+(max_idx)
else:
	ans=(n-min_idx-1)+(max_idx-1)


print(ans)