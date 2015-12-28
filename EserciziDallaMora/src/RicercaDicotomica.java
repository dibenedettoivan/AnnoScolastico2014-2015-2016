/*Dato un array di interi ricercare un elemento utilizzando la tecnica della ricerca dicotomica.*/

import java.util.Scanner;

public class RicercaDicotomica {
	
	private static Scanner in = new Scanner(System.in);
	private static int n,cerc,trovato;
	 static int cerca(int n, int ele, int vet[])
	    {
	        int sx = 0;//estremo sinistro
	        int dx = n-1;//estremo destro
	        do
	        {
	            int md = (dx + sx)/2;//valore medio
	            if(ele == vet[md])
	                return md;//elemento trovato nell indice md
	            else
	                if(ele > vet[md])
	                    sx = md+1;
	                else
	                    dx = md-1;
	        }
	        while(sx <= dx);
	        return -1;
	    }
	 
	 public static void main(String[] args){
	        
	        System.out.print("Inserire la grandezza dell'array: ");
	        n = in.nextInt();
	        int vet[]  = new int [n];
	        System.out.println("Caricamento Array.");
	        for(int i = 0 ;i < n; i++)
	        {
	            System.out.print("Inserisci il " + (i + 1) + "° elemento: ");
	            vet[i] = in.nextInt();
	        }
	        System.out.print("Inserisci l'elemento da cercare: ");
	        cerc = in.nextInt();
	        trovato = cerca(n, cerc, vet);
	        if(trovato == -1)
	            System.out.print("L'elemento non è stato trovato.");
	        else
	            System.out.print("L'elemento è stato trovato nella " + (trovato) + "° posizione");
	    }
}
	   