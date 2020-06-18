for _ in range(int(input())):

    n,m,k=map(int,input().split())

    count=1
    
    while((n+m)<=k):
        count+=1
        if(n>=m):
            temp=n
            n+=m
            m=temp
            
        else:
            temp=m
            m+=n
            n=temp
        # print(n,m)
    
    print(count)