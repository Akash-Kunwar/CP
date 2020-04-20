n=int(input())
a=list(map(int,input().split()))
la=[1]*n
ra=[1]*n
ans=1
for i in range(n-1):
    if a[i]<a[i+1]:
        ra[i+1]=ra[i]+1
        ans=max(ra[i+1],ans)
for i in range(n-1,1,-1):
    if a[i]>a[i-1]:
        la[i-1]=la[i]+1
        ans=max(ans,la[i-1])
for i in range(n-2):
    if a[i]<a[i+2]:
        ans=max(ans,ra[i]+la[i+2])



print(ans)