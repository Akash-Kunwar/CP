for _ in range(int(input())):
    x,y,n=map(int,input().split())

    m=n%x

    if(m==y):
        print(n)
    elif(m>y):
        print(n-(m-y))
    else:
        n-=m
        print(n-x+y)
