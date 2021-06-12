package POO;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			Scanner leia = new Scanner(System.in);
			Cachorro cachorro = new Cachorro();
			Cavalo cavalo =new Cavalo();
			Preguica preguica=new Preguica();
			OutrosAnimais   outros = new OutrosAnimais();
			Animal1 animal = null;

				
				int x;
				do
				{
					System.out.println("\nQual a espécie de animal? \n\n1-Cachorro\n2-Cavalo\n3-Preguiça\n");
					x = leia.nextInt();
					if(x==1)
					{
						animal=cachorro;
						System.out.println("\nQual o nome do seu cachorro?");
						String nome = leia.next();
						System.out.println("\nQuantos anos seu cachorro tem?");
						int idade = leia.nextInt();
						System.out.println("\nQual o som que esse animal emite?");
						String som = leia.next();
						System.out.println("------------------------------------------------------");
						cachorro.Nome(nome);
						cachorro.Idade(idade);
						cachorro.Som(som);
						cachorro.Corre();
						cachorro.Pula();
					}
					else if(x==2)
					{
						
						animal=cavalo;
						System.out.println("\nQual o nome do seu cavalo?");
						String nome = leia.next();
						System.out.println("\nQuantos anos seu cavalo tem?");
						int idade = leia.nextInt();
						System.out.println("\nEssa é legal!!!Qual o som que seu cavalo emite?");
						String som = leia.next();
						System.out.println("------------------------------------------------------");
						cavalo.Nome(nome);
						cavalo.Idade(idade);
						cavalo.Som(som);
						cavalo.Corre();
						
					}
					else if(x==3)
					{
						animal=preguica;
						System.out.println("\nQual o nome da sua preguiça?");
						String nome = leia.next();
						System.out.println("\nQuantos anos sua preguiça tem?");
						int idade = leia.nextInt();
						System.out.println("\nQual o tipo de  som que esse animal emite?");
						String som = leia.next();
						System.out.println();
						preguica.Nome(nome);
						preguica.Idade(idade);
						preguica.Som(som);
						preguica.Dorme();
						preguica.Lento();
					}
					else (x>=4)
					{
						animal=outros;
						System.out.println("\nEste campo é invalido,mas pra nosso registro,qual a espécie do seu animal?");
						String nome = leia.next();
						System.out.println("\nQuantos anos esse animal tem?");
						int idade = leia.nextInt();
						System.out.println("\nQual o tipo de som que esse animal emite?");
						String som = leia.next();
						System.out.println();
						outros.Nome(nome);
						outros.Idade(idade);
						outros.Som(som);
				
						
			
					}
						while (x<=0 || x>=4);

		}
   }