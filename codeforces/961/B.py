n,k=map(int,input().split())

arr=list(map(int,input().split()))

t=list(map(int,input().split()))
res=0
for i in range(n):
    if(t[i]==1):
        res+=arr[i]
        arr[i]=0

dp=[0]*n
dp[0]=arr[0]
count=1
i=1
while(i<n):
    if(count<k):
        count+=1
        dp[i]=dp[i-1]+arr[i]
    else:
        dp[i]=dp[i-1]+arr[i]-arr[i-k]
    i+=1
# print(dp)

print(max(dp)+res)
