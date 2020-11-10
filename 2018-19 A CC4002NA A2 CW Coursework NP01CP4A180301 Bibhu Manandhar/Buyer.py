def readData_():
    buyerList = []
    file = open("Buyer.txt","r")
    for line in file:
        buyerList.append(line[:-1])
    return buyerList

def addBuyer(name):
    file = open("Buyer.txt","a")
    file.write(name+"\n")
    file.close()

def bookborrow(name):
    file = open(name+".txt","r")
    bookborrow = {}
    for line in file:
        line = line.replace("\n","")
        info = line.split(",")
        bookborrow[info[0]] = info[1:]
    file.close()
    return bookborrow
    
