for _ in  range(int(input())):
    n,m,x,y=map(int,input().split())

    arr=[]

    for i in range(n):
        a=list(input())
        arr.append(a)
    if(x*2<y):
        y=x*2
    ans=0
     
    for i in range(n):
        for j in range(m):
            if(arr[i][j]=='.' and j<m-1 and arr[i][j+1]=='.'):
                ans+=y
                arr[i][j]='*'
                arr[i][j+1]='*'
            elif(arr[i][j]=='.'):
                ans+=x
    print(ans)