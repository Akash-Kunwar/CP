n=int(input())
ans=[]
for i in range(n):
    ans.append(list(input()))
count=0
for i in range(n):
    for j in range(n):
        if ans[i][j]=='X':
            if i-1>-1 and j-1>-1 and i+1<n and j+1<n and  ans[i-1][j-1]=='X' and ans[i+1][j+1]=='X' and ans[i+1][j-1]=='X' and ans[i-1][j+1]=='X':
                count+=1
print(count)