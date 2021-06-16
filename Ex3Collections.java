package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3Collections {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int op;
			try (Scanner leia= new Scanner(System.in)) {
				ArrayList<String> estoque = new ArrayList<String>();
				
				do
				{
					System.out.println("\n\t\tDigite uma opção:");
					System.out.println("*************************************************");
					System.out.println("\n(1)-Para  adicionar produtos ao estoque \n(2)- Para remover um produto "
							+ "\n(3)- Para atualizar produto/trocar produto \n(4)- Mostrar todos os produtos do estoque"
							+ "\n(0)- Encerrar programa.");
					op = leia.nextInt();
					
					switch(op)
					{
					case 1:
						leia.nextLine();
						System.out.println("\nQue produto deseja ter no estoque?: ");
						String produto = leia.nextLine();
						estoque.add(produto);

		                System.out.print("Entre com a quantidade do produto: ");
		                int quantidade = leia.nextInt();
		                estoque.size();
		                leia.nextLine();
						break;
					case 2:
						leia.nextLine();
						System.out.println("\nQual produto deseja remover do estoque? : ");
						String produto1 = leia.nextLine();

		                System.out.print("Entre com a quantidade do produto que deseja remover: ");
		                int quantidade1 = leia.nextInt();
		                leia.nextLine();
						if(estoque.contains(produto1))
						{
							estoque.remove(produto1);
						}
						else
						{
							System.out.println("\nEste produto não contem no estoque!");
						}
						break;
					case 3:
						leia.nextLine();
						System.out.println("\nQual  produto que deseja atualizar: ");
						String atualiza = leia.nextLine();
						System.out.println("\nPor qual produto será feita a troca pelo "+atualiza+" ? ");
						String novo = leia.nextLine();
						if(estoque.contains(atualiza))
						{
							estoque.remove(atualiza);
							estoque.add(novo);
							
						}
						else
						{
							System.out.println("\nEste produto não contem no estoque!");
						}
						System.out.println(estoque);
						break;
					case 4:
						System.out.println("\nOs produtos do estoque são: ");
						System.out.println(estoque);
						break;
						default:
							System.out.println("\nFinalizou o programa!!!");
					}
				}
				while(op!=0);
			}
		}
	
}
