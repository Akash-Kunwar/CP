n,k=map(int,input().split())

arr=list(map(int,input().split()))
ans=0
a=[]
a.append(arr[0])
for i in range(1,n):
    req=0
    if(arr[i-1]+arr[i]<k):
        req=k-arr[i-1]
        ans+=abs(arr[i]-req)
        arr[i]=req
        a.append(req)
    else:
        a.append(arr[i])
print(ans)
print(*a)