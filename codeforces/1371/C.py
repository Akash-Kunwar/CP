def fun(v,c,g1,g2):
	if(v+c<g1+g2):
		return "No"

	if(v>c):
		if(g2>c):
			return "No"
		else:
			return "Yes"
	else:
		if(g2>v):
			return "No"
		else:
			return "Yes"
for _ in range(int(input())):
	v,c,g1,g2=map(int,input().split())

	print(fun(v,c,g1,g2))
