package POO;
public class Preguica extends Animal1{
		
	
		public Preguica ()
		{ super ("Preguica");
		}
		

		
		@Override
		public void Nome(String nomeAnimal)
		{
			System.out.println("\nNome da pregui�a: "+nomeAnimal);
		}
		
		@Override
		public void Idade(int idadeAnimal)
		{
			System.out.println("\nIdade: "+idadeAnimal);
		}
		
		@Override
		public void Som(String somAnimal)
		{
			System.out.println("\nSom que a sua pregui�a emite: "+somAnimal);
		}
		
		public void  Lento()
		{
			System.out.println("\n Pregui�as s�o conhecidas por serem lentas,essa n�o escapa");
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
