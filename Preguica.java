package POO;
public class Preguica extends Animal1{
		
	
		public Preguica ()
		{ super ("Preguica");
		}
		

		
		@Override
		public void Nome(String nomeAnimal)
		{
			System.out.println("\nNome da preguiça: "+nomeAnimal);
		}
		
		@Override
		public void Idade(int idadeAnimal)
		{
			System.out.println("\nIdade: "+idadeAnimal);
		}
		
		@Override
		public void Som(String somAnimal)
		{
			System.out.println("\nSom que a sua preguiça emite: "+somAnimal);
		}
		
		public void  Lento()
		{
			System.out.println("\n Preguiças são conhecidas por serem lentas,essa não escapa");
		}
		public void Dorme() 
		{
			System.out.println("\n Alem de tudo,tambem dorme muito.");

		}



		@Override
		public void Peso(int pesoAnimal) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void Tamanho(int tamanhoAnimal) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void Cor(String corAnimal) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void Pelagem(String peloAnimal) {
			// TODO Auto-generated method stub
			
		}
		
		
}
