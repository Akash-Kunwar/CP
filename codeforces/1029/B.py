def two_pointer(arr,n):
    i,j=0,0

    ans=1
    while(i<n):
        j=i
        while(j+1<n and arr[j+1]<=(arr[j]*2)):
            j+=1
        ans=max(ans,j-i+1)
        
        i=j+1
    return ans


n=int(input())
arr=list(map(int,input().split()))
print(two_pointer(arr,len(arr)))