for _ in range(int(input())):
    n=int(input())

    arr=list(map(int,input().split()))
    arr.insert(0,0)

    dp=[1]*(n+1)

    for i in range(1,n+1):
        for j in range(i*2,n+1,i):
            if(arr[j]>arr[i]):
                dp[j]=max(dp[j],dp[i]+1)
    
    print(max(dp))