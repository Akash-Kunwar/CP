def fun(a,b,n):
    ans=[]
    pos1,pos2=0,n-1
    flip=False

    for i in range(n-1,-1,-1):
        
        if(not flip):
            if(a[pos1]==b[i]):
                ans.append(1)
            ans.append(i+1)
            flip=True
            pos1+=1
        else:
            if(a[pos2]!=b[i]):
                ans.append(1)
            ans.append(i+1)
            flip=False
            pos2-=1

    return ans





for _ in range(int(input())):
    n=int(input())
    a=list(input())
    b=list(input())
    arr=fun(a,b,n)
    print(len(arr),end=' ')
    if(len(arr)>0):
        print(*arr)
    else:
        print()