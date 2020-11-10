import bookborrow
import bookreturn
import read

moreCustomers = "Y"
while moreCustomers == "Y":
    print("Hi there,please select the following options")
    print()
    print("To view available books press:'D'")
    print("To Borrow a book press: 'B'")
    print("To Return a book press: 'R' ")
    print("To Exit the program press: 'X' ")

    decision = input("Select the given options:").upper()
    while decision == "" or decision not in "DBRX":
        decision  = input("Invalid Option! Enter again!!").upper()
        
    if decision == "D":
        print("List of availabe books.")
        read.read_()
    elif decision == "B":
        bookborrow.borrow_()
    elif decision == "R":
        bookreturn.return_()
    elif decision == "X":
        moreCustomers = "N"
        break
    
    moreCustomers = input("Next customer (Y/N)? ").upper()

    
print("Thank you for visiting, please come again soon")    
    
