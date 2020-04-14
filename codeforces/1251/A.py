for test in range(int(input())):
    ans=[]
    s=input()
    n=len(s)
    i=0
    while(i<n):
        j=i+1
        while(j<n and s[j]==s[i]):
            j+=1
        if (j-i)%2!=0:
            ans.append(s[i])
        i=j
    ans=list(set(ans))
    ans.sort()
    print(''.join(ans))    