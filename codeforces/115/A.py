n=int(input())
l=[int(input()) for i in range(n)]
m=0
for i in range(len(l)):
    j=i
    ans=0
    while(l[j]!=-1):
        ans+=1
        j=l[j]-1
    m=max(m,ans)
print(m+1)
