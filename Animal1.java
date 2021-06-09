/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/
	public class Animal1 {
				
			private String nome;
			private int idade;
			private int peso;
			private String tamanho;
			
				public Animal1(String nome,int idade,int peso,String tamanho)
				{
					super();
					this.nome = nome;
					this.idade = idade;
					this.peso=peso;
					this.tamanho=tamanho;
				}
				
				public String getNome() {
					return nome;
				}
				
				public int getIdade() {
					return idade;
				}
				public int getPeso() {
					return peso;
				}
				public String getTamanho() {
					return tamanho;
				}
	}




