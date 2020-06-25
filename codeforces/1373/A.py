for _ in range(int(input())):

    n,m,k=map(int,input().split())

    ans=[]

    if(n>=k):
        ans.append(-1)
    else:
        ans.append(1)
    if(k/m >=n ):
        ans.append(-1)
    else:
        ans.append(m)
    print(*ans)