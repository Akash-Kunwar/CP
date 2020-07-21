def fun(a,b,n):
    ans=[]
    i=n-1
    while(i>-1):
        # print(i)
        if(a[i]==b[i]):
            # print(a[i],i)
            pass
        else:
            if(a[0]==b[i]):
                ans.append(1)
                if(a[0]=='0'):
                    a[0]='1'
                else:
                    a[0]='0'
            
            ans.append(i+1)
            
            for j in range(i+1):
                if(a[j]=='0'):
                    a[j]='1'
                else:
                    a[j]='0'
            k,j=0,i
            while(k<j):
                temp=a[k]
                a[k]=a[j]
                a[j]=temp
                k+=1
                j-=1
        # print(a)
        i-=1
    # print(a)
    return ans


for _ in range(int(input())):
    n=int(input())
    a=list(input())
    b=list(input())
    # print('ans')
    arr=fun(a,b,n)
    print(len(arr),end=' ')
    if(len(arr)>0):
        print(*arr)
    else:
        print()