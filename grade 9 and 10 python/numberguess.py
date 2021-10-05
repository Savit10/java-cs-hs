import random

#Introduction
print("""Hello, welcome to the Number Guessing Game!
         In this game, please enter a lower integer and a higher integer
         and the computer will generate a number between them. You then have 5 guesses to guess
         the number, and you'll get hints along the way""")

#Upper Bound
upper = int(input("The highest number?: "))

#Lower Bound
lower = int(input("The lowest number?: "))

#Random Number Generator
random = random.randrange(lower, upper)

print("I will now give you three guesses to guess the number")

for i in range(0,3):
    guess = int(input("Guess?: "))
    if (guess==random):
        print("Good job, you're correct!")
    else:
        print("Try again")
