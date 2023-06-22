package entities;

import excecoes.SalarioExcedidoException;

public class MotoristaEventual extends Motorista {

	private double salarioPorKm;

	public MotoristaEventual(String nome, String email, Boolean sexo, double salarioPorKm) {
		super(nome, email, sexo);
		try {
			this.alteraSalarioPorKm(salarioPorKm);
		} catch (SalarioExcedidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public MotoristaEventual(MotoristaEventual motoristaEventual) {
		super(motoristaEventual.getNome(), motoristaEventual.getEmail(), motoristaEventual.getCodigoIdentificador());

	}

	@Override
	public double calculaSalario() {
		return this.salarioPorKm * Movimentacao.calculaKmRodados(this);
	}
	
	//resolver esse trem doido aqui
	public void alteraSalarioPorKm(double salarioPorKm) throws SalarioExcedidoException {
		if (salarioPorKm > 1.0) {
			throw new SalarioExcedidoException("Salario nao poder exceder 1 real por km!");
		}
		this.salarioPorKm = salarioPorKm;
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
