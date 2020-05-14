for _ in range(int(input())):
    n=int(input())

    if(n==0):
        print(0)
    else:
        temp=0
        i=3
        while(i<=n):
            t=(i-1)//2
            t=t*4
            t=t*(i-1)
            temp+=t
            i+=2
        print(temp)
