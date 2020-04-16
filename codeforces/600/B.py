def binary(arr,s,n,ele):
    pos=0
    start=s
    end=n-1
    if ele<arr[0]:
        return 0

    while(start<=end):
        mid=(start+end)//2
        # print(mid)
        if arr[mid]<=ele:
            start=mid+1
        elif arr[mid]>ele:
            pos=mid
            end=mid-1
    if pos==0:
        return n
    return  pos
n,m=map(int,input().split())
ans=[]
arr=list(map(int,input().split()))
brr=list(map(int,input().split()))
arr.sort()
for i in brr:
    ans.append(binary(arr,0,n,i))
for i in ans:
    print(i,end=' ')

# print(binary([1 ,3 ,5 ,7 ,9],0,5,4))