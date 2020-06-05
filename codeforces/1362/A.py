def dp(m,s,pre):
    if(m==s):
        return 0
    m=bin(m)[2:]
    s=bin(s)[2:]

    if(m.find(s)==-1 or '1' in m[len(s):] or m.find(s)!=0):
        return -1
    
    num=len(m)-len(s)
    # print(num)
    return pre[num]

    


    


ans=[]
pre=[0]*100
pre[1]=1
pre[2]=1
pre[3]=1
for i in range(4,100):
    pre[i]=min(min(pre[i-3]+1,pre[i-2]+1),pre[i-1]+1)
for _ in range(int(input())):
    n,m=map(int,input().split())
    
    ans.append(dp(max(n,m),min(m,n),pre))
for i in ans:
    print(i)
# print(*pre)