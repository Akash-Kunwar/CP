n=list(input())
flag=-1
for i in range(len(n)):
    if(int(n[i])%8==0):
        flag=int(n[i])
        break
    for j in range(i+1,len(n)):
        if(int(n[i]+n[j])%8==0):
            flag=int(n[i]+n[j])
            break
        for k in range(j+1,len(n)):
            if(int(n[i]+n[j]+n[k])%8==0):
                flag=int(n[i]+n[j]+n[k])
                break
if(flag==-1):
    print('NO')
else:
    print('YES')
    print(flag)