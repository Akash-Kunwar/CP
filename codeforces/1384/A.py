for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    s=''
    for i in range(26):
        s+=chr(97+i)
    s+=s
    ans=[]
    ans.append(s)
    for i in range(n):
        s=list(s)
        s[arr[i]]=chr((ord(ans[-1][arr[i]])-97+1)%26+97)
        ans.append(''.join(s))
    for i in ans:
        print(i)