/*
	Fa�a um Programa que leia 20 n�meros inteiros aleat�rios (entre 0 e 100) armazene-os num vetor.
	Ao final mostre os n�meros e seus antecessores e sucessores.
*/

package exerciciosArray;

import java.util.Random;

public class Ex03NumerosAleatorios {

	public static void main(String[] args) {
		  Random random = new Random();
		  
		  int numAleatorios[] = new int [20];
		  
		  for(int i = 0; i < numAleatorios.length; i++) {
			  int numero = random.nextInt(100);
			  
			  numAleatorios[i] = numero;
		  }
		  
		  System.out.print("N�meros aleat�rios: ");
		  
		  for(int numero: numAleatorios) {
			  System.out.print(numero + " ");
		  }
		  
		  System.out.print("\nAntecessores dos n�meros aleat�rios: ");
		  
		  for(int numero: numAleatorios) {
			  System.out.print((numero - 1)+ " ");
		  }
		  
		  System.out.print("\nSucessores dos n�meros aleat�rios: ");
		  
		  for(int numero: numAleatorios) {
			  System.out.print((numero + 1)+ " ");
		  }
		  
	}

}
