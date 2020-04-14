def binary(arr, n, k): 
    l = 0
    r = n - 1
    leftGreater = n 

    while (l <= r): 
        m = int(l + (r - l) / 2) 
  

        if (arr[m] >= 1-arr[k]): 
            leftGreater = m 
            r = m - 1
  

        else: 
            l = m + 1
  
    return leftGreater


n=int(input())
arr1=list(map(int,input().split()))
arr2=list(map(int,input().split()))
ans=[]
for i in range(n):
    ans.append(arr1[i]-arr2[i])
ans.sort()
count=0
# print(ans)
for i in range(n):
    if ans[i]>0:
        res=binary(ans,len(ans),i)
        if res!=-1:
            count+=i-res
print(count)

