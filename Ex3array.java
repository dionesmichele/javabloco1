package Array;
import java.util.Scanner;

public class Ex3array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		final int linha=3,coluna=3;
		int[][] num = new int[linha][coluna];
		int l,c,valorMaior= 0;

		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<num.length;l++){		
			for( c=0;c<num.length;c++){
				System.out.println("\nEntre com a sua nota: ");
				num[l][c] = leia.nextInt();
				
				if(num [l][c] > 10) {
		                valorMaior=valorMaior+1;
					}		
			}	
		}	
			System.out.printf("\n A quantidade de valores maiores que 10 é %d ",valorMaior);
		
		
		
		
	}	

	
}
	