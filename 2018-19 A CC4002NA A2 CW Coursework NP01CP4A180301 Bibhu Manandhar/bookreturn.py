import Buyer
import datetime
import read

def return_():
    b = read.read_()
    
    name = input("Please enter customers name:")
    if name not in Buyer.readData_():
        print("You have not borrowed any books yet!")
        return
    
    file = open(name+".txt","a")
    bookborrow = Buyer.bookborrow(name)
    totalSum = 0
    addBook = "Y"
    select = {}
    while addBook == "Y":
        valid = False
        while not valid:
            book = input("Please enter book ID:").upper()
            if book not in b:
                print("Invalid Input")
            elif book not in bookborrow:
                print("You have not borrowed this book")
            elif book in select:
                print("Book has already been selected")
            else:
                valid = True
            
        quantity = int(b[book][2])
        newQuantity = quantity + 1
        b[book][2] = str(newQuantity)

        todayDate = str(datetime.datetime.now())[:10]
        borrowDate = bookborrow[book][3][:10]
        borrowDuration = (datetime.datetime.strptime(todayDate, "%Y-%m-%d") - datetime.datetime.strptime(borrowDate, "%Y-%m-%d")).days 

        if borrowDuration > 10:
            fine = (borrowDuration - 10) * 1.5
        else:
            fine = 0

        file.write(book+","+b[book][0]+","+b[book][1]+","+str(fine)+","+todayDate+"\n")
        totalSum += fine
        select[book] = [b[book][0],b[book][1],fine,todayDate]
        addBook = input("Want to select another book?(Y/N)").upper()

    read.stockUpdate(b)

    file.write("Total Amount: " +str(totalSum)+"\n")
    file.close()
    print()
    print("Invoice")
    print()
    print("============================Library Management System========================")
    print("-" * 90)
    print("Book ID             Book Name                      Author        Fine      Date/Time")
    print("-" * 90)
    for key, values in select.items():
        print(key, "\t\t", values[0], "\t\t", values[1], "\t", values[2],"\t", values[3])
    print("-" * 90)
    print("Total:\t\t\t\t\t\t$",totalSum)
    print("-" * 90)
    print("Thank you for visiting, please come again soon")
    print()
    print()
