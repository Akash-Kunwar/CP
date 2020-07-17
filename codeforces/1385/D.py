def recur(s,a):
    if(len(s)==0):
        return 0
    if(len(s)==1):
        if(s==a):
            return 0
        else:
            return 1
    
    m=len(s)//2

    start=s[:m]
    end=s[m:]

    op1=(m-start.count(a))+recur(end,chr(ord(a)+1))
    op2=(m-end.count(a))+recur(start,chr(ord(a)+1))

    return min(op1,op2)





for _ in range(int(input())):
    n=int(input())
    s=input()

    print(recur(s,'a'))


