for _ in range(int(input())):
    n,m,k=map(int,input().split())

    x=int(n/k)

    f=min(x,m)

    rem=m-f

    k-=1

    if(rem%k==0):
        print(f-int(rem/k))
    else:
        print(f-int(rem/k)-1)

