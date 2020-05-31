def dynamic(odd,even,total):
    if(total%2==0 and even==0):
        return 'NO'
    if(odd%2==1):
        return 'YES'
    
    odd-=1
    
    if(odd>0 and odd+even>=total and odd%2==1):
        return 'YES'

    return 'NO'


for _ in range(int(input())):
    n,total=map(int,input().split())
    odd=0
    even=0
    arr=list(map(int,input().split()))
    for i in arr:
        if(i%2==0):
            even+=1
        else:
            odd+=1
    print(dynamic(odd,even,total))

    



