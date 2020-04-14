for i in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    d={}
    maxcount=0
    for i in range(len(arr)):
        if arr[i] in d.keys():
            d[arr[i]]+=1
        else:
            d[arr[i]]=1
        maxcount=max(maxcount,d[arr[i]])
    diff=len(d)
    # print(maxcount,diff)
    print(max(min(diff-1,maxcount),min(maxcount-1,diff)))
    