/*
 * Hacer un programa que pida un número por teclado
 * Se tiene que hacer un recorrido desde 1 hasta numero introducido.
 * 
 * Ejemplo:
 * Numero introducido: 12
 * 
 * Pares: 2+4+6+8+10+12
 * Impares: 1+3+5+7+9+11
 * 
 * Tiene que imprimir la suma de los números pares e impares
 */

import java.util.Scanner; //Importamos libreria

public class SumaDeParesEImpares {

	public static void main(String[] args) {
		
		System.out.println ("Por favor introduce el número:"); //Introducimos el numero
		Scanner numeroingresado = new Scanner (System.in); //Escaneamos el número ingresado
		int numero = numeroingresado.nextInt(); //Lo asignamos a un entero llamado "numero"

		
		int sumapares= 0; //Inicializamos nuestra variable "sumapares" en 0
		int sumaimpares= 0; //Inicializamos nuestra variable "sumaimpares" en 0
		

		//Iniciamos en 1 y nos detenemos hasta el número ingresado, sumandose en el contador correspondiente
		for (int i = 1; i <= numero; i++) { 
			
			if (i % 2==0) { //Si el numero es divisible entre dos, se agrega al contador "sumapares"
				sumapares = sumapares+i;
			}
			else { //De no cumplirse lo anterior, se agrega al contador "sumaimpares"7
				sumaimpares = sumaimpares +i;
				
				
			}
			
		}
		System.out.println("La suma de los numeros pares del número elegido es: " + sumapares);
		System.out.println ("La suma de los numeros impares del número elegido es: " + sumaimpares);
	}
}
		

