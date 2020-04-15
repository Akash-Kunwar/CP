for i in range(int(input())):
    num,x,y=map(int,input().split())
    while(x>0 and y>0):
        temp=num
        temp=temp//2
        temp+=10
        if temp>num:
            num-=10
            y-=1
        else:
            num=temp
            x-=1

    if num-y*10<=0:
        print('YES')
    else:
        print('NO')