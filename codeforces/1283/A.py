for i in range(int(input())):
    h,m=map(int,input().split())
    h=24-h-1
    m=60-m
    print(h*60+m)