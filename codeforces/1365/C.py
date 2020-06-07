def most_frequent(arr,n):
  max_count=1
  curr_count=1

  for i in range(1,n):
    if(arr[i]==arr[i-1]):
      curr_count+=1
    else:
      max_count=max(curr_count,max_count)
      curr_count=1
  return max(max_count,curr_count)


n=int(input())
arr=list(map(int,input().split()))
brr=list(map(int,input().split()))

hm={}

for i in range(n):
  hm[arr[i]]=[i]
for i in range(n):
  hm[brr[i]].append(i)


count=[]

for i in arr:
  pos1=hm[i][0]
  pos2=hm[i][1]

  if(pos1==pos2):
    count.append(0)
  elif(pos1>pos2):
    count.append(n-pos1+pos2)
  else:
    count.append(pos2-pos1)

count.sort()
print(most_frequent(count,n))