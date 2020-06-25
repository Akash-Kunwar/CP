for _ in range(int(input())):
    s=list(input())
    n=len(s)
    v=[0]*(n+1)
    curr=0
    for i in range(0,n):
        if(s[i]=='+'):
            curr+=1
        else:
            curr-=1

        if(curr<0):
            if(v[abs(curr)]==0):
                v[abs(curr)]=i+1


    val=n

    for i in range(1,n+1):
        if(v[i]!=0):
            val+=v[i]
        else:
            break
    print(val)






