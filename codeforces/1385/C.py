def d(a,n):
    i=n-1

    count=0

    while(i>0 and a[i-1]>=a[i]):
        count+=1
        i-=1
    while(i>0 and a[i]>=a[i-1]):
        count+=1
        i-=1
    
    return n-count-1



ans=''
for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    ans+=str(d(arr,n))+'\n'
print(ans)