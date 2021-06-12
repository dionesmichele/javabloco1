package POO;

		public class Cavalo extends Animal1{
			
			public  Cavalo()
			{
				super("Cavalo");
			}
			
			@Override
			public void Nome(String nomeAnimal)
			{
			
			
			System.out.println("\nNome do cachorro: "+nomeAnimal);
			}
			
			@Override
			public void Idade(int idadeAnimal)
			{
				System.out.println("\nIdade: "+idadeAnimal);
			}
			
			@Override
			public void Som(String somAnimal)
			{
				System.out.println("\nSom que o seu cachorro emite: "+somAnimal);
			}
			@Override
			public void Cor(String corAnimal)
			{
				System.out.println("\n A cor deste cachorro é  "+corAnimal);
			}
			@Override
			public void Pelagem(String peloAnimal)
			{
				System.out.println(" e sua pelagem é do tipo "+peloAnimal);
			}
			 
			public void Corre()
			{
			    System.out.println(" esse animal corre ");
			}
			
		
			public void Trota()
			{
			    System.out.println("\nesse animal cavalga trotando");
			}

			@Override
			public void Peso(int pesoAnimal) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void Tamanho(int tamanhoAnimal) {
				// TODO Auto-generated method stub
				
			}
			
		}
