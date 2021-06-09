
public class Cavalo extends Animal1{
		
		private String trota;
		private String relincha;
		private String cor;
		private String pelagem;
		
		public Cavalo(String nome,int idade,int peso,String tamanho,String trota,String relincha,String cor,String pelagem)
		
		{ super(nome,idade,peso,tamanho);
		this.cor=cor;
		this.pelagem=pelagem;
		this.trota=trota;
		this.relincha=relincha;
		}
		public String getTrota() {
			return trota;
		}
		public String getRelincha() {
			return relincha;
		}
		public String getCor() {
			return cor;
		}
		public String getPelagem() {
			return pelagem;
		}
		public void imprimirInfo()
		{
			System.out.println("\nNome do animal: "+getNome()+
					",sua idade � : "+getIdade()+"anos"+" seu peso �  "+getPeso()+"kgs"+"\nseu tamanho �  "+getTamanho()+
					", sua cor �  "+getCor()+" e sua pelagem �  "+getPelagem()+
					"\nesse animal cavalga trotando"+getTrota()+" e relincha"+getRelincha());
			
		}
}
