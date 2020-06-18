n=int(input())
if(n==1):
    print('codeforces')
else:
    mul=1
    arr=[1]*10
    while(mul<n):
        flag=0
        for i in range(10):
            mul/=arr[i]
            arr[i]+=1
            # print(arr[i]*mul)
            if(arr[i]*mul<n):
                mul*=arr[i]
            else:
                flag=1
                break
        if(flag==1):
            break
        # print(mul)

    c='codeforces'
    ans=''
    for i in range(10):
        ans+=c[i]*arr[i]
    print(ans)



