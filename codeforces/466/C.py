def countWays(arr,n):
    count=[0]*n

    s=sum(arr)
    if(s%3!=0):
        return 0
    else:
        s=s//3
    ss=0
    for i in range(n-1,-1,-1):
        ss+=arr[i]
        if(ss==s):
            count[i]=1
    for i in range(n-2,-1,-1):
        count[i]+=count[i+1]

    ans=0
    ss=0

    for i in range(0,n-2):
        ss+=arr[i]

        if(ss==s):
            ans+=count[i+2]
    return ans 


n=int(input())
arr=list(map(int,input().split()))

print(countWays(arr,n))