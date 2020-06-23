for _ in range(int(input())):
    n=int(input())
    s=list(input())
    i=0
    while(i<len(s)):
        if(s[i]=='1'):
            break
        i+=1
    j=len(s)-1
    while(j>=0):
        if(s[j]=='0'):
            break
        j-=1
    if(i<j):
        print(''.join(s[0:i])+'0'+''.join(s[j+1:]))
    else:
        print(''.join(s))

            