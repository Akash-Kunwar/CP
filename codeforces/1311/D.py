for test in range(int(input())):
    a,b,c=map(int,input().split())
    ans=1e9
    for ca in range(1,2*a+1):
        for cb in range(ca,2*b+1,ca):
            for i in range(0,2):
                cc=cb*(c//cb)+i*cb
                res=abs(ca-a)+abs(cb-b)+abs(cc-c)
                if ans>res:
                    ans=res
                    A=ca
                    B=cb
                    C=cc
    print(ans)
    print(A,B,C)
