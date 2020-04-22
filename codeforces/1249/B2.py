from collections import defaultdict
class Graph:
    def __init__(self,N):
        self.n=N
        self.graph=defaultdict(list)
    def add(self,arr):
        visited=[0]*(self.n+1)
        ans=[0]*(self.n+1)
        for i in range(1,self.n+1):
            if visited[i]==0:
                curr=i
                nextEle=arr[i-1]
                visited[curr]=1
                status=[]
                status.append(curr)
                count=1
                while(nextEle!=curr):
                    visited[nextEle]=1
                    status.append(nextEle)
                    nextEle=arr[nextEle-1]
                    count+=1
                    
                for i in status:
                    ans[i]=count
        return ans
                





for test in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    g=Graph(n)
    for i in g.add(arr)[1:]:
        print(i,end=' ')
    print()
