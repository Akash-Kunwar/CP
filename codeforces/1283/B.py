for test in range(int(input())):
    n,k=map(int,input().split())
    print(min(((int(n/k)*k)+k//2),n))