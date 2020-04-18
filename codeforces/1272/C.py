n,k=map(int,input().split())
s=list(input())
arr=list(input().split())

i=0
count=0
while(i<len(s)):
    j=i
    while( j<len(s) and s[j] in arr ):
        j+=1
    count+=((j-i+1)*(j-i))//2
    i=j+1
print(count)
    
