import math
def primeFactors(n): 
    even,odd=0,0      
    # Print the number of two's that divide n 
    while n % 2 == 0: 
        even+=1 
        n = n / 2
          
    # n must be odd at this point 
    # so a skip of 2 ( i = i + 2) can be used 
    for i in range(3,int(math.sqrt(n))+1,2): 
          
        # while i divides n , print i ad divide n 
        while n % i== 0: 
            odd+=1 
            n = n / i 
              
    # Condition if n is a prime 
    # number greater than 2 
    if n > 2: 
        odd+=1
    return odd,even 

# print(primeFactors(11))
for _ in range(int(input())):
    n=int(input())
    if(n==1):
        print("FastestFinger")
    elif(n==2):
        print('Ashishgup')
    elif(n%2!=0):
        print('Ashishgup')
    elif(n&(n-1)==0):
        print('FastestFinger')
    elif(n%2==0 and n%4==0):
        print('Ashishgup')
    else:
        x=primeFactors(n//2)
        if(x[0]==1 and x[1]==0):
            print('FastestFinger')
        else:
            print('Ashishgup')



