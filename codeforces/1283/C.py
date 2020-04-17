n=int(input())
res=list(map(int,input().split()))
empty_pos=[]
ele=[0]*(n+1)
for i in range(len(res)):
    if res[i]==0:
        empty_pos.append(i+1)
    else:
        ele[res[i]]=1
rem=[]
for i in range(1,len(ele)):
    if ele[i]==0:
        rem.append(i)
for i in range(len(rem)):
    if rem[i]==empty_pos[i]:
        if i==0:
            rem[i],rem[1]=rem[1],rem[i]
        else:
            rem[i],rem[0]=rem[0],rem[i]
for i in range(len(empty_pos)):
    res[empty_pos[i]-1]=rem[i]
for i in res:
    print(i,end=' ')        

