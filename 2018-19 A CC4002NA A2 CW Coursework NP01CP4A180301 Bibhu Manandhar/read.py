def read_():
    print("==========================Library Management System======================================")
    print("-" * 90)
    print("Book ID           Book Name                Author             Quantity       Price")
    print("-" * 90)
    file = open("books.txt","r")

    for line in file:
        line = line.replace("\n","")
        print(line.replace(",","\t\t"))
    print("-" * 90)

    books = open("books.txt","r")
    b = {}
    for line in books:
        line = line.replace("\n","")
        data = line.split(",")
        b[data[0]] = data[1:]

    return b

def stockUpdate(b):
    file = open("books.txt","w")
    for key, values in b.items():
        file.write(key)
        for i in values:
            file.write("," + i)
        file.write("\n")
    file.close()

