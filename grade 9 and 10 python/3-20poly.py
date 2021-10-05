from turtle import *
reset()
shape("triangle")
n= input("How many sides(between 3 and 20)?: ")
counter = 0
times = int(n)
while counter < times:
  forward(40)
  right(180-(((int(n)-2)*180)/int(n)))
  counter = counter + 1