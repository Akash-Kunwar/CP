for i in range(int(input())):
    n=int(input())
    if n==1 or n==2 or n==0:
        print(0)
    else:
        if n%2==0:
            print((n//2)-1)
        else:
            print(n//2)