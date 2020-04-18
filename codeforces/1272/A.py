def calc(arr):
    arr=list(set(arr))
    arr.sort()

    if len(arr)==1:
        return 0
    elif len(arr)==2:
        if abs(arr[0]-arr[1])-2<0:
            return 0
        else:
            return 2*(abs(arr[1]-arr[0])-2)
    else:
        if arr[0] !=arr[1]:
            arr[0]+=1
        if arr[2]!=arr[1]:
            arr[2]-=1
        return abs(arr[0]-arr[1])+abs(arr[0]-arr[2])+abs(arr[1]-arr[2])
    
    
for i in range(int(input())):
    a,b,c=map(int,input().split())
    print(calc([a,b,c]))