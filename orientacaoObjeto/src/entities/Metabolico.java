package entities;

public class Metabolico {
	
	//precisa do peso + genero + numero de calorias

	public double peso;
	public double gender;
	public double kcal;
	
	public void peso_masculino(double peso) {
		this.peso *= 24.2;
	}
	
	public void peso_feminino(double peso) {
		 this.peso *= 22.0;
	}
	
	public void genders(double kcal) {
		if(gender == 0) {
			this.peso_masculino();
		}else if(gender == 1) {
			this.peso_feminino();
		}
	}
	
	public String toString() {//sobrepor a operação padrao / imprimir a minha versao da String
		return peso 
				+ ", " 
		        + gender
				+ ", " 
		        + kcal
		        ;
	}

	private void peso_feminino() {
		this.peso *= 22.0;
	}

	private void peso_masculino() {
		this.peso *= 24.2;
	}
}
