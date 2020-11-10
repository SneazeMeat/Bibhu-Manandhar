import Buyer
import datetime
import read

def borrow_():
    b = read.read_()
    name = input("Please enter customer name:")
    if name not in Buyer.readData_():
        Buyer.addBuyer(name)
        bookborrow = []
        file = open(name+".txt","w")
    else:
        bookborrow = Buyer.bookborrow(name)
        file = open(name+".txt","a")

    totalSum = 0
    addBook = "Y"
    select = {}
    while addBook == "Y":
        valid = False
        while not valid:
            book = input("Please enter Book ID:").upper()
            if book not in b:
                print("Invalid Input")
            elif book in select:
                print("Book has already been selected")
            elif book in bookborrow:
                print("Book has already been borrowed")
            elif b[book] == 0:
                print("The book you requested is out of stock")
            else:
                valid = True
        quantity = int(b[book][2])
        newQuantity = quantity - 1
        b[book][2] = str(newQuantity)
        date = str(datetime.datetime.now())[:19]
        file.write(book+","+b[book][0]+","+b[book][1]+","+b[book][3]+","+date+"\n")
        totalSum += float(b[book][3][1:])
        select[book] = [b[book][0],b[book][1],b[book][3],date]

        addBook = input("Want to select another book?(Y/N)").upper()

    file.write("Total Amount: " + str(totalSum)+"\n")
    file.close()
    read.stockUpdate(b)

    print()
    print("Invoice")
    print()
    print("============================Library Management System========================")
    print("-" * 90)
    print("Book ID             Book Name                      Author             Price      Date/Time")
    print("-" * 90)
    for key, values in select.items():
        print(key, "\t\t", values[0], "\t\t", values[1], "\t", values[2],"\t", values[3])
    print("-" * 90)
    print("Total Cost:\t\t\t\t\t\t$",totalSum)
    print("-" * 90)
    print("Thank you for visiting, please come again soon")
    print()
    print()
        
    
