for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))

    d={}

    for i in arr:
        if i in d.keys():
            continue;
        else:
            print(i,end=' ')
            d[i]=1
    print()