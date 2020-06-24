s=input()
ans=False
for i in range(len(s)-1):
    if(s[i]=='A' and s[i+1]=='B'):
        if(i+2<len(s)-1 and s[i+2:].count('BA')!=0):
            ans=True
            break
for i in range(len(s)-1):
    if(s[i]=='B' and s[i+1]=='A'):
        if(i+2<len(s)-1 and s[i+2:].count('AB')!=0):
            ans=True
            break
if(ans):
    print('YES')
else:
    print('NO')