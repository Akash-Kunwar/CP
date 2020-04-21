for test in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split()))
    stack=[]
    stack.append(arr[0])
    for i in range(0,n):
        if stack[-1]<0 and arr[i]>0:
            stack.append(arr[i])
        elif stack[-1]>0 and arr[i]>0:
            if stack[-1]<arr[i]:
                stack.pop(-1)
                stack.append(arr[i])
        if stack[-1]>0 and arr[i]<0:
            stack.append(arr[i])
        if stack[-1]<0 and arr[i]<0:
            if stack[-1]<arr[i]:
                stack.pop(-1)
                stack.append(arr[i])
    print(sum(stack))






