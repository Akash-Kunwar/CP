for _ in range(int(input())):
    n,m=map(int,input().split())
    a=list(map(int,input().split()))
    b=list(map(int,input().split()))
    d={}
    flag=-1
    for i in a:
        if i not in d.keys():
            d[i]=1
        else:
            d[i]+=1
    
    for j in b:
        if j in d.keys():
            print('YES')
            print(1,j)
            flag=0
            break
    if(flag==-1):
        print('NO')
