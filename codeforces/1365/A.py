for _ in range(int(input())):
  n,m=map(int,input().split())

  arr=[]

  for i in range(n):
    temp=list(map(int,input().split()))
    arr.append(temp)
  row=0
  for i in range(n):
    if (1 not in arr[i]):
      row+=1;
  
  zero=[0]*m

  for i in range(n):
    for j in range(m):
      zero[j]+=arr[i][j]
  
  col=zero.count(0)

  ans=min(row,col)

  if(ans%2==1):
    print('Ashish')
  else:
    print('Vivek')  