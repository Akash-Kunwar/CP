def main():
    n=int(input())
    arr=list(map(int,input().split()))
    Max=max(arr)
    if(n==1):
        print(1)
    elif(len(set(arr))==1):
        print(-1)
    else:
        idx=-1
        for i in range(n):
            if(arr[i]==Max):
                if(i+1<n and arr[i]!=arr[i+1]):
                    idx=i+1;
                if(i-1>=0 and arr[i]!=arr[i-1]):
                    idx=i+1;
        if(idx==-1):
            print(-1)
        else:
            print(idx)
x=int(input())
while(x>0):
    main()
    x-=1