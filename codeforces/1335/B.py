def position(arr):
    for i in range(len(arr)):
        if arr[i]!=0:
            return i
    return 0
def count1(arr):
    count=0
    for i in range(len(arr)):
        if arr[i]!=0:
            count+=1
    return count
for test in range(int(input())):
        n,a,b=map(int,input().split())
        arr=[0]*26
        ans=[]
        b1=b
        for i in range(a):
            # print(arr)
            if b1>0:
                arr[b1-1]+=1
                ans.append(chr(97+b1-1))
                b1-=1
            else:
                pos=position(arr)
                ans.append(chr(97+pos))
                arr[pos]+=1
        remove=0
        # print(ans)
        while(len(ans)!=n):
            arr[ord(ans[remove])-97]-=1
            if count1(arr)>=b:
                pos=position(arr)
                ans.append(chr(97+pos))
                arr[pos]+=1
            else:
                pos=arr.index(0)
                ans.append(chr(97+pos))
                arr[pos]+=1

            remove+=1
        print(''.join(ans))
            
        