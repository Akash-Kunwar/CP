from collections import defaultdict
n,k=map(int,input().split())
arr=list(map(int,input().split()))
temp=[0]*5001
for i in arr:
    temp[i]+=1
if(max(temp)>k):
    print('NO')
elif(k>n):
    print('NO')
else:
    print('YES')
    d=defaultdict(list)
    c=0
    t=[0]*n
    for i in range(n):
        t[i]=arr[i]
    t.sort()
    for i in range(len(t)):
        d[t[i]].append(c+1)
        c=(c+1)%k
    p=[0]*5001
    for i in range(len(arr)):
        print(d[arr[i]][p[arr[i]]],end=' ')
        p[arr[i]]+=1





