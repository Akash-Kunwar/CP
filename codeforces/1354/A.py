import sys
def fun(a,b,c,d):
    if(a<=b):
        return b
    if(c<=d):
        return -1
    sleep=c-d
    need=a-b
    if(need%sleep==0):
        mt=need//sleep
    else:
        mt=need//sleep
        mt+=1
    return mt*c + b



t=sys.stdin.readline()
ans=[]
for _ in range(int(t)):
    a,b,c,d=map(int,sys.stdin.readline().split())
    
    ans.append(fun(a,b,c,d))
for i in ans:
    print(i)