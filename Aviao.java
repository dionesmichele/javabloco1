package OrientaçaoObjetos;

public class Aviao {
		/*
		 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto avião, defina as instancias deste
		objeto e apresente as informações deste objeto no console.
		 */

			private String modelo, companhia,embarque,desembarque;
			private int viajantes, horasVoo;
			private boolean liberadoParaVoo;
			
			public Aviao () {
				this.setModelo(modelo);
				this.setCompanhia(companhia);
				this.setHorasVoo(horasVoo);
			}
			
		
			// getters e setters
			public String getModelo() {
				return modelo;
			}
			public void setModelo(String modelo) {
				this.modelo = modelo;
			}
			public String getCompanhia() {
				return companhia;
			}
			public void setCompanhia(String companhia) {
				this.companhia = companhia;
			}

			public int getViajantes() {
				return viajantes;
			}

			public void setViajantes(int viajantes) {
				this.viajantes = viajantes;
			}

			public String getDesembarque() {
				return desembarque;
			}

			public void setDesembarque(String desembarque) {
				this.desembarque = desembarque;
			}

			public String getEmbarque() {
				return embarque;
			}

			public void setEmbarque(String embarque) {
				this.embarque = embarque;
			}
			public int getHorasVoo() {
				return horasVoo;
			}
			public void setHorasVoo(int horasVoo) {
				this.horasVoo = horasVoo;
			}
			public boolean isLiberadoParaVoo() {
				return liberadoParaVoo;
			}
			public void setLiberadoParaVoo(boolean liberadoParaVoo) {
				this.liberadoParaVoo = liberadoParaVoo;
			}
			
			//metodos
			public void liberaAviao () {
				setLiberadoParaVoo(true);
			}

	}


