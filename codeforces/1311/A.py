def check(n,m):
    if n==m:
        return 0
    elif n<m:
        if n%2!=0 and m%2==0:
            return 1
        elif n%2!=0 and m%2!=0:
            return 2
        elif n%2==0 and m%2==0:
            return 2
        else:
            return  1
    else:
        if n%2!=0 and m%2==0:
            return 2
        elif n%2!=0 and m%2!=0:
            return 1
        elif n%2==0 and m%2==0:
            return 1
        else:
            return  2


for i in range(int(input())):
    n,m=map(int,input().split())
    print(check(n,m))
    