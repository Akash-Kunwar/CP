for _ in range(int(input())):
  n=int(input())
  arr=list(map(int,input().split()))
  t=list(map(int,input().split()))

  c0=t.count(0)
  c1=t.count(1)

  if(c1!=0 and c0!=0):
    print('Yes')
  else:
    temp=arr.copy()
    temp.sort()
    if(temp==arr):
      print('Yes')
    else:
      print('No')