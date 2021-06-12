package Array;

import java.util.Scanner;

public class Ex2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados*/
		int [] num = new int[6];
		
 		int somapar = 0, quantimpar = 0;
	
		Scanner ler = new Scanner (System.in);
		
		for (int x = 0; x < 6; x++)
		{
			System.out.println("\nDigite um Número:  ");
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
			System.out.println("\nOs números pares foram:  ");
			
			for (int x = 0; x < 6; x++)
			{
				if (num[x] % 2 == 0)
				{
					System.out.println("\n\t"+ num[x]);
				}
			} 
			
			System.out.println("\nA Soma dos números Pares é :  " + somapar);
			
			System.out.println("\nOs números Ímpares foram:  ");
				
			for (int x = 0; x < 6; x++)
			{	
				if (num[x] % 2 == 1)
				{
					System.out.println("\n\t"+ num[x]);
				}
			}
			System.out.println("\nA Quantidade de Números Ímpares é : " + quantimpar);
	}

		
}