def cut(arr,n,cost):
    odd=[0]*n
    even=[0]*n

    if(arr[0]%2==0):
        even[0]=1
    else:
        odd[0]=1

    for i in range(1,n):
        if(arr[i]%2==0):
            even[i]=1+even[i-1]
        else:
            even[i]=even[i-1]
        if(arr[i]%2!=0):
            odd[i]=1+odd[i-1]
        else:
            odd[i]=odd[i-1]
    
    ans=[]
    # print(*even)
    # print(*odd)
    for i in range(n-1):
        if(even[i]==odd[i]):
            ans.append(abs(arr[i]-arr[i+1]))
    ans.sort()

    f_cost=0
    j=0
    c=0
    while(j<len(ans)):
        f_cost+=ans[j]
        if(f_cost<=cost):
            c+=1
        else:
            break
        j+=1
    return c


n,cost=map(int,input().split())

arr=list(map(int,input().split()))

print(cut(arr,n,cost))