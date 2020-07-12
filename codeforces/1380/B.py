for _ in range(int(input())):
    s=list(input())
    h={'P':0,'S':0,'R':0}
    for i in s:
        h[i]+=1
    mi=0
    key=''
    for i in h.keys():
        if(h[i]>mi):
            mi=h[i]
            key=i
    if(h['P']==1 and h['S']==1 and h['R']==1):
        print('PSR')
    else:
        if(key=='P'):
            print('S'*len(s))
        elif(key=='R'):
            print('P'*len(s))
        else:
            print('R'*len(s))

        