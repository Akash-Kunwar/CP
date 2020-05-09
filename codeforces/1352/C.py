for _ in range(int(input())):
    n,m=map(int,input().split())
    not_divisible=n-1
    mul=int(m/not_divisible)
    dec=m%not_divisible
    if(dec==0):
        dec=-1
    ans=(n*mul)+dec
    print(ans)

