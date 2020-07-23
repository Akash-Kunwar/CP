from collections import defaultdict
def bfs(g,n):
    ans=[]
    q=[]
    visited=[True]*(n+1)
    q.append((1,0,1))
    visited[1]=False
    while(len(q)!=0):
        
        city,l,p=q.pop()
        neighbours = []
        for i in g[city]:
            if(visited[i]):
                neighbours.append(i)
        x=len(neighbours)

        if(x==0):
            ans.append(l*p)
        else:
            new_p=p/x
            for nbs in neighbours:
                q.append((nbs,l+1,new_p))
        visited[city]=False
    return ans




g=defaultdict(list)
n=int(input())
for i in range(n-1):
    u,v=map(int,input().split())
    g[u].append(v)
    g[v].append(u)
a=bfs(g,n)
print(sum(a))
