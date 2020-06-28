for _ in range(int(input())):
    n=int(input())
    st=[]
    s=list(input())

    for i in s:
        # print(st,i)
        if(len(st)==0):
            st.append(i)
        elif(i=='('):
            st.append(i)
        elif(i==')'):
            if(st[-1]=='('):
                st.pop(-1)
            else:
                st.append(i)
    # print(st)
    print(len(st)//2)