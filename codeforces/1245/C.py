def d(arr):
    n=len(arr)
    MOD=1000000007
    dp=[0]*(n+1)
    dp[0]=1
    dp[1]=1

    for i in arr:
        if(i=='w' or i=='m'):
            return 0
    for i in range(2,n+1):
        dp[i]=dp[i-1]
        if(arr[i-1]==arr[i-2] and (arr[i-1]=='u' or arr[i-1]=='n')):
            dp[i]=(dp[i]+dp[i-2])%MOD
    # print(dp)
    return dp[-1]


print(d(list(input())))