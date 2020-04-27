n,k=map(int,input().split())

arr=list(map(int,input().split()))

dp=[0]*n

dp[0]=arr[0]
for i in range(1,len(arr)):
    dp[i]=max(arr[i],k-dp[i-1])
count=0
for i in range(n):
    count+=abs(dp[i]-arr[i])
print(count)
for i in range(n):
    print(dp[i],end=" ")