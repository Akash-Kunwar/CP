for _ in range(int(input())):
    n=int(input())
    n=(n-1)//2
    ans=((n+1)*n*(2*n+1))//6
    print(ans*8)