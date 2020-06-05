for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    flag =  -1
    s=set(arr)
    for i in range(1,1024):
        a=[]
        for j in s:
            a.append(i^j)
        s1=set(a)
        if(s1==s):
            flag=i
            break
    print(flag)