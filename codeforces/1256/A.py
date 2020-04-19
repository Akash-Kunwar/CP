for i in range(int(input())):
    a,b,n,s=map(int,input().split())
    total=1
    # while(a!=0 and total<s):
    #     total+=n
    #     # print(total)
    #     a-=1
    mul=(int)(s/n)
    total=n*min(mul,a)
    # print(total)
    if total>s:
        total-=n
    if total==s or s-total<=b:
        print('YES')
    else:
        print('NO')
    # print(total)

            


    

        