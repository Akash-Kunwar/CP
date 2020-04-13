for test in range(int(input())):
    change=[8,4,0,1,3,6,7,5,2]
    ans=[]
    for i in range(9):
        arr=list(input())
        curr=int(arr[change[i]])
        if curr>1:
            arr[change[i]]=str(curr-1)
        else:
            arr[change[i]]=str((curr+1))
        ans.append(''.join(arr))
    for i in ans:
        print(i)