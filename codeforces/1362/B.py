for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    flag =  -1  
    for i in range(1,1024):
        a=[]
        for j in arr:
            a.append(i^j)
        # print(a)
        if(set(arr)==set(a)):
            flag=i
            break
    print(flag)