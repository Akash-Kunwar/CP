for i in range(int(input())):
    a,b,c,d=map(int,input().split())
    x=b
    z=c
    y=(b+c)//2
    while(x+y<z or x+z<y or z+y<x):
        y=(y+c)//2
    if x+y==z:
        print(x,z,z)
    else:
        print(x,y,z)
