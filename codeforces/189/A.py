n,a,b,c=map(int,input().split())
dp=[0]*(n+1)
for i in range(1,n+1):
    curr=int(-1e9)
    if i-a>=0:
        curr=max(curr,dp[i-a])
    if i-b>=0:
        curr=max(curr,dp[i-b])
    if i-c>=0:
        curr=max(curr,dp[i-c])
    dp[i]=curr+1
print(dp[n])

