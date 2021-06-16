package OrientaçaoObjetos;

public class Cliente {

		// TODO Auto-generated method stub
		/*
		 *1) Crie uma classe cliente e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto cliente, defina as instancias deste
		objeto e apresente as informações deste objeto no console.
		 */

			
			private String nome,endereco,email;
		int idade;
			
	
			
			public Cliente () {
				//this.setCodigo(cliente);
				this.setNome(nome);
				this.setIdade(idade);
				this.setEmail(email);
				this.setEndereco(endereco);
			}
			

			public Cliente(int i, String string, String string2) {
				// TODO Auto-generated constructor stub
			}


			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public String getEndereco() {
				return endereco;
			}

			public void setEndereco(String endereco) {
				this.endereco = endereco;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public int getIdade() {
				return idade;
			}

			public void setIdade(int idade) {
				this.idade = idade;
			
			}
			
	}
