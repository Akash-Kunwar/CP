for _ in range(int(input())):
    n,m,k=map(int,input().split())
    a,b=m,m
    for i in range(k):
        l,r=map(int,input().split())
        if(l>b):
            pass
        elif(r<a):
            pass
        elif(l<=a and r>=a):
            a=min(l,a)
            b=max(b,r)
        elif(l>=a and r>=b):
            a=min(l,a)
            b=max(b,r)


    print(b-a+1)