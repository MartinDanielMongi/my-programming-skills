print('Ingrese la cantidad de personas a agendar:')
cantidad=int(input('Cantidad de personas:'))
class Personas:
    def __init__(self, documentos, edad, nombre):
        self.documentos= documentos
        self.edad= edad
        self.nombre= nombre

for x in range (0, cantidad):
    print ("Ingrese el nombre de la persona numero ", x+1)
    intento= str(input('Nombre:'))
    documentoes=int(input('Documento:'))
    edades= int(input('Edad:'))
    intento= Personas(documentoes, edades, intento)
informacion=str(input ('Desea saber los datos de alguna perona? (Y/N)'))
if informacion=='Y':
    """cual=str(input('Escriba el nombre de esa persona:'))"""
    print ('Mi nombre es:', intento.nombre)
   """ print ('Mi documento es:', cual.documentos)
    print ('Mi edad es:', cual.edad)"""
