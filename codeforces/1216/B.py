# 3
# 20 10 20
from collections import defaultdict
n=int(input())
arr=list(map(int,input().split()))

d=defaultdict(list)

for i in range(n):
    if arr[i] in d.keys():
        d[arr[i]].append(i+1)
    else:
        d[arr[i]].append(i+1)
arr.sort()
arr.reverse()
ans=0
s=''
for i in range(n):
    ans+=i*arr[i]+1
    s+=str(d[arr[i]][0])+" "
    d[arr[i]].pop(0)
print(ans)
print(s)
