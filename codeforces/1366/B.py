for _ in range(int(input())):
    n,m,k=map(int,input().split())
    a,b=m,m
    for i in range(k):
        l,r=map(int,input().split())
        if(l<=b and r>=a):
            a=min(a,l)
            b=max(b,r)
    print(b-a+1)