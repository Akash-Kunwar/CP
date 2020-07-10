for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    arr.sort()
    res=[]
    for i in range(n//2):
        res.append(arr[n-i-1])
        res.append(arr[i])
    if(n%2!=0):
        res.append(arr[(n//2)])
    res.reverse()
    print(*res)


    