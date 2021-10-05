def hours_to_mins():
    mins = int(hours)*60
    print(str(mins) + " mins")
    
print("Hello! Welcome to the hours_to_mins Conversion Program")
question = input("Would you like to convert from hours to mins?:  ")

if question == ("yes" or "Yes"):
    hours = input("How many hours?: ")
    hours_to_mins()

else:
    print("Really? Check your input again.")