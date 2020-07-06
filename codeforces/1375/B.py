n,m=0,0
def fun(arr,ans):
    for i in range(n):
        for j in range(m):
            if(arr[i][j]>ans[i][j]):
                return -1
    return 0
for _ in range(int(input())):
    n,m=map(int,input().split())

    arr=[]

    for i in range(n):
        a=list(map(int,input().split()))
        arr.append(a)
    

    ans=[[4]*m for i in range(n)]

    ans[0][0]=2
    ans[n-1][m-1]=2
    ans[0][m-1]=2
    ans[n-1][0]=2

    for i in range(1,m-1):
        ans[0][i]=3
    for i in range(1,m-1):
        ans[n-1][i]=3
    for i in range(1,n-1):
        ans[i][0]=3
    for i in range(1,n-1):
        ans[i][m-1]=3

    x=fun(arr,ans)
    if(x==0):
        print('YES')
        for i in range(n):
            print(*ans[i])
    else:
        print('NO')
        # print('-1')

    
    