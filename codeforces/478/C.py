a=list(map(int,input().split()))
a.sort()
if(2*(a[0]+a[1])<=a[2]):
	print(a[0]+a[1])
else:
	print((a[0]+a[1]+a[2])//3)	



