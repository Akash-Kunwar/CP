for test in range(int(input())):
    n=int(input())
    n=n//2
    if n%2!=0:
        print('NO')
    else:
        print('YES')
        ans=[]
        curr=2
        count=n
        while(count>0):
            if str(curr)[-1]!='8':
                ans.append(curr)
                count-=1
            curr+=2
        count=n
        curr=1
        while(count>0):
            if str(curr)[-1]!='3':
                ans.append(curr)
                count-=1
            curr+=2
        for i in ans:
            print(i,end=' ')
        print()
            

        
                

