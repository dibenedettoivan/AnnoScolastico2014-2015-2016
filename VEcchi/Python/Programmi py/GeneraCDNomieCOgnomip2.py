'''Realizzare un programma in grado di generare liste anagrafiche
realizzate in modo casuale per verificare il funzionamento di
un sistema gestionale in via di sviluppo. Il prgramma deve, a
partire da dati generati casualmente. DI BENEDETTO IVAN'''

import random

Cognomi = ['Impastato', 'Rossi', 'Crescenzo', 'Bella', 'Bruni',
           'Santis', 'Martinelli', 'Sferrazza', 'Sorrentino', 'Riva',
           'Costantini', 'Storti', 'Baglio']

Nomi = ['Filippo', 'Giuseppe', 'Antonio', 'Michele', 'Andrea',
        'Denise', 'Alessandra', 'Michelle', 'Roberta', 'Chiara']

Comune = ['Venezia', 'Firenze', 'Perugia', 'Aosta', 'Catania',
          'Trieste', 'Campobasso', "L'Aquila", 'Potenza', 'Roma']

CodComune = ['L736', 'D612', 'G478', 'A326', 'C351',
             'L424', 'B519', 'A345', 'G942', 'H501']

GiorniMesi = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]


def DataDiNascita():
    Anno = random.choice(range(1920, 2014))
    Mese = random.choice(range(1, 13))
    Giorno = random.randint(1, len(GiorniMesi))
    return str(Giorno) + '/' + str(Mese) + '/' + str(Anno)

def ListaAnagrafica():
    lis = []
    Co = random.choice(Cognomi)
    lis.append(Co)
    No = random.choice(Nomi)
    lis.append(No)
    if No in ['Denise', 'Alessandra', 'Michlle', 'Roberta', 'Chiara']:
        Sesso = 'F'
    else:
        Sesso = 'M'
    lis.append(Sesso)
    data = DataDiNascita()
    lis.append(data)
    Com = random.choice(Comune)
    lis.append(Com)
    return lis

def CoNo(a):
    vocali = 'AEIOU'
    c = ''
    for i in range(0,len(a)):
        if a[i] not in vocali:
            c = c + a[i]
        if len(c) == 3:
            break
    if len(c) < 3:
        while len(c) < 3:
            c = c + 'X'
    return c

def codCoNo(Cognomi, Nomi):
    jCo = Cognomi.upper()
    jNo = Nomi.upper()
    return CoNo(jCo) + CoNo(jNo)

def codNascita(data, Sesso):
    l = data.split('/')
    codMesi = 'ABCDEHLMPRST'

    CodAnno = str(l[2])[2] + str(l[2]) [3]
    CodMese = codMesi [int(l[1]) - 1]
    CodGiorno = int(l[0])
    if Sesso =='F':
        CodGiorno = CodGiorno + 40
    if CodGiorno < 10:
        CodGiorno = '0' + str(l[0])
    else:
        CodGiorno = str(CodGiorno)
    return CodAnno + CodMese + CodGiorno

def UltimaLettera(cf):
    a = '0123456789ABCDEFGHIJKLMNOPOQRSTUVWXYZ'
    CarPari = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
            13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
    CarDispari = [1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 1, 0, 5, 7, 9, 13, 15, 17, 19,
               21, 2, 4, 18, 20, 11, 3, 6, 8, 12, 14, 16, 10, 22, 25, 24, 23]
    contatore = 0
    for i in range(len(cf)):
        if i % 2 == 0:
            for j in range(len(a)):
                if cf[i] == a[j]:
                    contatore = contatore + CarDispari[j]
                    break
        if i % 2 == 1:
            for j in range(len(a)):
                if cf[i] == a[j]:
                    contatore = contatore + CarPari[j]
                    break
    return a[contatore % 26 + 10]

def CodiceFiscale(lista):
    CF = codCoNo(lista[0], lista[1]) + codNascita(lista[3], lista[2])
    for i in range(len(Comune)):
        if lista[4] == Comune[i]:
            CF = CF + CodComune[i]
    CF = CF + UltimaLettera(CF)
    lista.append(CF)


lista = ListaAnagrafica()
CodiceFiscale(lista)
print lista







    


