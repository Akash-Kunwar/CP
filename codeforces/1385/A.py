for _ in range(int(input())):
    a=list(map(int,input().split()))

    if(len(set(a))==3):
        print('NO')
    else:
        if(len(set(a))==1):
            print('YES')
            print(*a)
        
        else:
            a.sort()

            f_=a.count(a[0])
            s_=a.count(a[-1])

            if(f_<s_):
                print('YES')
                print(a[0],a[0],a[1])
            else:
                print('NO')
