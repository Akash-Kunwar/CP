for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))

    for i in range(n):
        if(i%2!=0):
            arr[i]=abs(arr[i])
        else:
            arr[i]=-abs(arr[i])
    
    print(*arr)