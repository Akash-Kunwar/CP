for i in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    count=[1]*n
    i=n-2
    while(i>=0):
        j=i
        while(j<n-1 and arr[j]>arr[j+1] and count[j]==1 ):
            temp=arr[j]
            arr[j]=arr[j+1]
            arr[j+1]=temp
            count[j]=0
            j+=1
        i-=1
    for i in arr:
        print(i,end=' ')
        