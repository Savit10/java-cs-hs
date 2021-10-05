print("Quadratic Calculator: form of ax^2+bx+c")
a=float(input("What is the value of a?:  "))
b=float(input("What is the value of b?:  "))
c=float(input("What is the value of c?:  "))

x=(((-b+((b**2)-(4*a*c))**(1/2)))/(2*a))
y=(((-b-((b**2)-(4*a*c))**(1/2)))/(2*a))

print(x)
print(y)
