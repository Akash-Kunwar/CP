def dp(brr,grr,b,g):
    brr.sort()
    grr.sort()
    ans=0
    for i in range(b):
        for j in range(g):
            if(abs(brr[i]-grr[j])==1 or abs(brr[i]-grr[j])==0):
                grr[j]=1000
                ans+=1
                break
    return ans


b=int(input())
brr=list(map(int,input().split()))

g=int(input())
grr=list(map(int,input().split()))

print(dp(brr,grr,b,g))