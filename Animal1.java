	package POO;
/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/
	public abstract class Animal1 {
		
		private String tipoAnimal;
		
		abstract public void Nome(String nomeAnimal);
		abstract public void Idade(int idadeAnimal);
		abstract public void Som(String somAnimal);
		abstract public void Peso(int pesoAnimal);
		abstract public void Tamanho(int tamanhoAnimal);
		abstract public void Cor (String corAnimal);
		abstract public void Pelagem (String peloAnimal);
		public Animal1(String tipoAnimal)
		{
			this.tipoAnimal = tipoAnimal;
		}
		
		public String getTipoAnimal() {
			return tipoAnimal;
		}
		public void setTipoAnimal(String tipoAnimal) {
			this.tipoAnimal = tipoAnimal;
		}

}