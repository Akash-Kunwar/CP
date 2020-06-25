for _ in range(int(input())):
    s=list(input())
    c_0,c_1=0,0
    for i in s:
        if(i=='0'):
            c_0+=1
        else:
            c_1+=1
    if (min(c_0,c_1)%2==0):
        print('NET')
    else:
        print('DA')
