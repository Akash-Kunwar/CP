MOD=10**9+9
def power(x, n): 
    result = 1; 
    while (n):  
        if (n & 1): 
            result = result * x % MOD
        n = int(n / 2); 
        x = x * x % MOD
    return result
for i in range(int(input())):
    n=int(input())
    curr=3
    k=2
    while(True):
        if n%curr==0:
            print(n//curr)
            break
        curr+=power(2,k)
        k+=1