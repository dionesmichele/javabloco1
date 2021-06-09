
public class Preguica extends Animal1{
		
		private String move_lento;
		private String dorme;
		public Preguica(String nome,int idade,String move_lento,String dorme,int peso,String tamanho)
		
		{ super(nome,idade,peso,tamanho);
		this.move_lento=move_lento;
		this.dorme=dorme;
		}
		public String getMove_lento() {
			return move_lento;
		}
		public String getDorme() {
			return dorme;
		}
		
		public void imprimirInfo()
		{
			System.out.println("\nNome do animal: "+getNome()+
					"\nIdade: "+getIdade()+" anos"+" seu peso é de  "+getPeso()+"kgs"+"\nseu tamanho é  "+getTamanho()+
					""+getMove_lento()+"\ne dorme"+getDorme());
			
		}
		
}
