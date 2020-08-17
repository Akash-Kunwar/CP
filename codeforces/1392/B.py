for _ in range(int(input())):
    n,k=map(int,input().split())
 
    arr=list(map(int,input().split()))
    # count=0
 
    s=max(arr)
    k-=1
    for i in range(len(arr)):
        arr[i]=s-arr[i]

    if(k%2==1):
        s=max(arr)
        for i in range(len(arr)):
            arr[i]=s-arr[i]

    print(*arr)