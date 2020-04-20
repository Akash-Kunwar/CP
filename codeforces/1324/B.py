for i in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    d={}
    flag=0
    for i in range(len(arr)):
        if arr[i] in d.keys():
            d[arr[i]]+=1
            if d[arr[i]]==3:
                flag=1
                break
            else:
                if arr[i-1]!=arr[i]:
                    flag=1
                    break
        else:
            d[arr[i]]=1
    if flag==0:
        print('NO')
    else:
        print('YES')