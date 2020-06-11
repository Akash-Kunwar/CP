for _ in range(int(input())):
    n,m=map(int,input().split())
    ans=n+m
    print(min(ans//3,min(n,m)))