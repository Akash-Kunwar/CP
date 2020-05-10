for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    d={}
    for i in arr:
        if  i in d.keys():
            d[i]+=1
        else:
            d[i]=1
    
    k=0
    # print(d)
    for i in range(n-1):
        s=arr[i]
        for j in range(i+1,n):
            s+=arr[j]
            if s in d.keys():
                k+=d[s]
                d[s]=0
    print(k)