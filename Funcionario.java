package OrientaçaoObjetos;

public class Funcionario {
	private String nome,endereco,email,setor,codigo;
	int idade;
		

		
		public Funcionario () {
			//this.setCodigo(cliente);
			this.setNome(nome);
			this.setIdade(idade);
			this.setEmail(email);
			this.setSetor(setor);
			this.setCodigo(codigo);
		}
		

		public Funcionario(int i, String string, String string2) {
			// TODO Auto-generated constructor stub
		}


		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
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


		public String getCodigo() {
			return codigo;
		}


		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}


		public String getSetor() {
			return setor;
		}


		public void setSetor(String setor) {
			this.setor = setor;
		}
		
}
