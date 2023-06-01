numero = int(input("Numero: "))

dic = {}
primo = 2
while primo <= numero:
    exponente = 0
    while numero % primo == 0:
        exponente += 1
        numero //= primo
    if exponente > 0:
        dic[primo] = exponente
    primo += 1
    
desc = []
for i in dic:
    desc.append(str(i)+"^"+str(dic[i]))
    
print(" * ".join(desc))
