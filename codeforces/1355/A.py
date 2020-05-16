for _ in range(int(input())):
    n,k=input().split()
    k=int(k)
    while(k>1):
        if('0' in n):
            break
        n=str(int(n)+int(max(n))*int(min(n)))
        k-=1
    print(n)