n,m=map(int,input().split())
cat=list(map(int,input().split()))
g=[[] for i in range(n)]
v=[0 for i in range(n)]
ans=0
for i in range(n-1):
    x,y=map(int,input().split())
    g[x-1].append(y-1)
    g[y-1].append(x-1)
#print(g)
q=[(0,0)]
l=0
while l<len(q):
    x,num=q[l]
    v[x]=1
    if cat[x]+num<=m:
        leaf=True
        for y in g[x]:
            if not v[y]:
                leaf=False
                q.append((y,cat[x]*(cat[x]+num)))
        if leaf:
            ans+=1
    l+=1
print(ans)