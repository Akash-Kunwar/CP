pr=[]
def ok(n,t):
    left=0
    right=n
    while(left<right):
        m=int((left+right)/2);
        pr.append(m);
        if(m<=t):
            left=m+1
        else:
            right=m;
    return 
mod=(int)(1e9)+7
n,m,idx=map(int,input().split())
ok(n,idx)
big,small,res=n-m,m-1,1
for i in pr:
    if(i>idx):
        res=(res*big)%mod
        big-=1;
    elif(i<idx):
        res=(res*small)%mod
        small-=1;
    else:
        res=res%mod
# print(pr)
for i in range(1,n-len(pr)+1):
    res=(res*i)%mod
print(res)