import sys
t=int(sys.stdin.readline())
a=[]
for _ in range(t):
    n=int(sys.stdin.readline())
    arr=list(map(int,sys.stdin.readline().split()))
    ans=0
    start=0
    arr.sort()
    for i in range(n):
        start+=1
        if(arr[i]==start):
            ans+=1
            start=0
    a.append(ans)
for i in a:
    print(i)