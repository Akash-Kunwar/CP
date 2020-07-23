from collections import defaultdict
def dfs(g,n):
    a1,a2=0,0

    q=[]
    q.append((1,1))
    visited=[True]*(n+1)
    visited[1]=False
    a1+=1
    while(len(q)!=0):
        # print(q)
        c,v=q.pop()

        for i in g[c]:
            if(visited[i]):
                visited[i]=False
                if(v==1):
                    a2+=1
                    q.append((i,0))
                else:
                    a1+=1
                    q.append((i,1))
    # print(a1,a2)
    return a1*a2-(n-1)

    




g=defaultdict(list)
n=int(input())
for i in range(n-1):
    u,v=map(int,input().split())
    g[u].append(v)
    g[v].append(u)
a=dfs(g,n)
print(a)
