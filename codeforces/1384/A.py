for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    
    s=''
    for i in range(52):
        s+='a'
    ans=[]
    ans.append(s)
    for i in range(n):
        s=list(ans[-1])
        
        if(s[arr[i]]=='b'):
            for j in range(arr[i],52):
                s[j]='a'
        else:
            for j in range(arr[i],52):
                s[j]='b'



        ans.append(''.join(s))
    for i in ans:
        print(i)