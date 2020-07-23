def du(s):
    ans=0
    for n in s.keys():
        temp=0
        x=n
        while(True):
            temp+=1
            nxt=d[x]
            if(nxt in d.keys()):
                x=nxt
            else:
                break
        ans=max(ans,temp)
    return ans+1

    


d={}
for _ in range(int(input())):
    s=input().split(' ')
    d[s[0].lower()]=s[2].lower()

print(du(d))

