n=int(input("Factorial of what?: "))
factor = 1
i = 1
if i<=n:
    while i<=n:
        factor = factor*i
        i=i+1
    print(factor)
else:
    print(factor)
