x=[1,-1,0,0]
y=[0,0,1,-1]
def bfs(arr,visited,n,m,e_x,e_y):
  q=[]

  if(arr[n][m]!='#'):
    visited[n][m]=True
    q.append([n,m])

  while(len(q)!=0):
    ele=q.pop(0)
    a=ele[0]
    b=ele[1]
    for k in range(4):
      na=a+x[k]
      nb=b+y[k]
      if(na>=0 and na<e_x and nb>=0 and nb<e_y):
        if(visited[na][nb]==False and arr[na][nb]!='#'):
          visited[na][nb]=True
          q.append([na,nb])
  

  






for _ in range(int(input())):
  n,m=map(int,input().split())

  arr=[]
  ans='Yes'
  for i in range(n):
    temp=list(input())
    arr.append(temp)


  for i in range(n):
    for j in range(m):
      if(arr[i][j]=='B'):
        for k in range(4):
          pos_x=i+x[k]
          pos_y=j+y[k]

          if(pos_x>=0 and pos_x<n and pos_y>=0 and pos_y<m):
            if(arr[pos_x][pos_y]=='G'):
              ans='NO'
            elif(arr[pos_x][pos_y]=='.'):
              arr[pos_x][pos_y]='#'
  

  visited=[[False]*m for i in range(n)]

  bfs(arr,visited,n-1,m-1,n,m)

  for i in range(n):
    for j in range(m):
      if(arr[i][j]=='G' and visited[i][j]==False):
        ans='NO'
        break
  # for i in range(n):
  #   print(visited[i])

  print(ans)

