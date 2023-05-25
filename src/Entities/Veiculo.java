package Entities;

public class Veiculo {
	private String placa;
	private double quilometragem;

	public Veiculo(String placa, double quilometragem) {
		super();
		this.placa = placa;
		this.quilometragem = quilometragem;
	}

	public Veiculo(Veiculo veiculo) {
		this.placa = veiculo.placa;
		this.quilometragem = veiculo.quilometragem;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	@Override
	public String toString() {
		return "Placa: " + placa + " - " + "km rodados: "+quilometragem  ;
	}

}
