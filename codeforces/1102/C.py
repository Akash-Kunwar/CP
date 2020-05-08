n,x,y=map(int,input().split())
arr=list(map(int,input().split()))

if(x-y>0):
    print(n)
else:
    arr.sort()
    count=0
    for i in arr:
        if(i<=x):
            count+=1
        else:
            break
    if(count%2==0):
        print(count//2)
    else:
        print((count//2) +1)