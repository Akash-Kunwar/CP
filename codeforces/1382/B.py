for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    v=-1
    for i in range(n):
        if(arr[i]>1):
            v=i
            break
        
    if(v==-1):
        if(n%2==1):
            print('First')
        else:
            print('Second')

    
    else:
        if(v%2==1):
            print('Second')
        else:
            print('First')

    