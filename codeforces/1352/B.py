for _ in range(int(input())):
    n,m=map(int,input().split())
    ans=[]
    if(n%2!=0 and m%2==0):
        flag=0
    elif(n%2!=0 and m%2!=0):
        if(m>n):
            flag=0
        else:
            for i in range(m-1):
                ans.append(1)
            ans.append(n-(m-1))
            flag=1
    elif(n%2==0 and m%2!=0):
        if(m>n//2):
            flag=0
        else:
            for i in range(m-1):
                ans.append(2)
            ans.append(n-(m-1)*2)
            flag=1
    else:
        if(m>n):
            flag=0
        else:
            for i in range(m-1):
                ans.append(1)
            ans.append(n-(m-1))
            flag=1
    if(flag==0):
        print('No')
    else:
        print('Yes')
        for i in ans:
            print(i,end=' ')




