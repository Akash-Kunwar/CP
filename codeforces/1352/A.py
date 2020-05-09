for _ in range(int(input())):
    n=input()
    ans=[]
    count=1
    for i in range(len(n)-1,-1,-1):
        if (n[i]!='0'):
            ans.append(int(n[i])*count)
        count*=10
    print(len(ans))
    for i in ans:
        print(i,end=' ')
