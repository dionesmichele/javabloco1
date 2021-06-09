
public class Cachorro extends Animal1{
	
		private String corre;
		private String late;
		private String cor;
		private String pelagem;
		public Cachorro(String nome,int idade,int peso,String tamanho,String corre,String late,String cor,String pelagem)
		
		{ super(nome,idade,peso,tamanho);
		this.corre=corre;
		this.late=late;
		this.cor=cor;
		this.pelagem=pelagem;
		}
		public String getCorre() {
			return corre;
		}
		public String getLate() {
			return late;
		}
		public String getCor() {
			return cor;
		}
		public String getPelagem() {
			return pelagem;
		}
		public void imprimirInfo()
		{
			System.out.println("\nNome do animal: "+getNome()+","
					+getIdade()+" anos"+"\nseu peso � "+getPeso()+"kg(s)"+",seu tamanho � "+getTamanho()+"\n sua cor �  "+getCor()+" e sua pelagem � "+getPelagem()+
					"\n esse animal corre e"+getCorre()+" late"+getLate());
			
		}  
		
}
