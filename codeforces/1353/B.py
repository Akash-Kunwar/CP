for _ in range(int(input())):
    n,k=map(int,input().split())
    arr=list(map(int,input().split())) 
    brr=list(map(int,input().split()))


    arr.sort()
    brr.sort()
    
    i=0
    j=n-1
    while(k>0):
        k-=1
        if(arr[i]>brr[j]):
            break
        else:
            arr[i]=brr[j]
            i+=1
            j-=1
    # print(arr)
    print(sum(arr))
