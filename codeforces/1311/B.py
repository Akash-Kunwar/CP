for test in range(int(input())):
    n,m=map(int,input().split())
    arr=list(map(int,input().split()))
    q=list(map(int,input().split()))
    query=[0]*n
    for i in range(len(q)):
        query[q[i]-1]=True
    while(True):
        ok=False
        for i in range(len(arr)-1):
            if query[i] and arr[i]>arr[i+1]:
                ok=True
                temp=arr[i+1]
                arr[i+1]=arr[i]
                arr[i]=temp
        if ok==False:
            break
    ok =True
    # print(arr)
    for i in range(len(arr)-1):
        if arr[i]>arr[i+1]:
            ok=False
    if ok==False:
        print('NO')
    else:
        print('YES')

