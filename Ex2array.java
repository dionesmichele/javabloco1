package Array;

import java.util.Scanner;

public class Ex2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados*/
		int [] num = new int[6];
		
 		int somapar = 0, quantimpar = 0;
	
		Scanner ler = new Scanner (System.in);
		
		for (int x = 0; x < 6; x++)
		{
			System.out.println("\nDigite um N�mero:  ");
			num [x]= ler.nextInt();
			 
			if (num[x] % 2 == 0)
			{
				somapar += num[x];
			}
			
			else 
			{
				quantimpar++;
			}
		}
			System.out.println("\nOs n�meros pares foram:  ");
			
			for (int x = 0; x < 6; x++)
			{
				if (num[x] % 2 == 0)
				{
					System.out.println("\n\t"+ num[x]);
				}
			} 
			
			System.out.println("\nA Soma dos n�meros Pares � :  " + somapar);
			
			System.out.println("\nOs n�meros �mpares foram:  ");
				
			for (int x = 0; x < 6; x++)
			{	
				if (num[x] % 2 == 1)
				{
					System.out.println("\n\t"+ num[x]);
				}
			}
			System.out.println("\nA Quantidade de N�meros �mpares � : " + quantimpar);
	}

		
}