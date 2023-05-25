package Entities;

public class MotoristaEventual extends Motorista {

	private double salarioPorViagem;
	
	public MotoristaEventual(String nome, String email, double salarioPorViagem) {
		super(nome, email);
		this.salarioPorViagem = salarioPorViagem;
		
	}
	
	public MotoristaEventual(MotoristaEventual motoristaEventual) {
		super(motoristaEventual.getNome(),motoristaEventual.getEmail(), motoristaEventual.getCodigoIdentificador());
		this.salarioPorViagem = motoristaEventual.salarioPorViagem;
	}
	
	@Override
	public double calculaSalario() {
		return salarioPorViagem * Movimentacao.calculaKmRodados(this);
		
	}

	@Override
	public Motorista copiaMotorista() {
		return new MotoristaEventual(this);
	}

	@Override
	public String getDescricao() {
		 return "Motorista eventual";
	}

	
}
