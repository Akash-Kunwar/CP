for i in range(int(input())):
    flag=1
    n=int(input())
    a=list(map(int,input().split()))
    odd=True
    even=True
    for i in range(n):
        if a[i]%2==0:
            odd =False
        if a[i]%2!=0:
            even=False

        
    if odd or even:
        print('YES')
    else:
        print('NO')