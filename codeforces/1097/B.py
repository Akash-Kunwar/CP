def possiblwWays(arr,n,k,total):
    if(k==n):
        if(total%360==0):
            return 1
        else:
            return 0

    op1=possiblwWays(arr,n,k+1,total+arr[k])
    op2=possiblwWays(arr,n,k+1,total-arr[k])

    return op1|op2


n=int(input())

arr=[]

for i in range(n):
    arr.append(int(input()))
if(possiblwWays(arr,n,0,0)==1):
    print('YES')
else:
    print('NO')