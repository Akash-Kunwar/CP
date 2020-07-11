import math
for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))

    maxi=0

    for i in range(1,n):
        if(arr[i]<arr[i-1]):
            maxi=max(arr[i-1]-arr[i],maxi)
            arr[i]=arr[i-1]
    if(maxi==0):
        print(0)
    else:
        print(int(math.log2(maxi))+1)