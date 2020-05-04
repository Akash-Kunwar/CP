n=int(input())
s=list(input())
ans=0
for i in range(0,n,2):
    pos1=i
    pos2=i+1
    # print(s[pos1],s[pos2])
    if((s[pos1]=='a' or s[pos2]=='a') and (s[pos1]=='b' or s[pos2]=='b')):
        pass
    elif(s[pos1]=='a' or s[pos2]=='a'):
        ans+=1
        s[pos1]='b'
    elif((s[pos1]=='b' or s[pos2]=='b')):
        ans+=1
        s[pos1]='a'

print(ans)
print(''.join(s))






