import math

def AreaDelCerchio(raggio):
	return math.pi * raggio ** 2

def Circonferenza(raggio):
	return math.pi * 2 * raggio

def Diametro(raggio):
	return raggio*2
	

r = input("Raggio del Cerchio?")
print "Diametro \tCirconferenza \tArea " 
print Diametro(r),"\t\t",
print Circonferenza(r),"\t",
print AreaDelCerchio(r),"\t",


