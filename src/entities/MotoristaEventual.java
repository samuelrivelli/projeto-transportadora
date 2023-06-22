package entities;

import excecoes.SalarioExcedidoException;

public class MotoristaEventual extends Motorista {

	private double salarioPorKm;

	public MotoristaEventual(String nome, String email, Boolean sexo) {
		super(nome, email, sexo);

	}

	public MotoristaEventual(MotoristaEventual motoristaEventual) {
		super(motoristaEventual.getNome(), motoristaEventual.getEmail(), motoristaEventual.getCodigoIdentificador());

	}

	@Override
	public double calculaSalario() throws SalarioExcedidoException {
		this.alteraSalarioPorKm(salarioPorKm);
		return salarioPorKm * Movimentacao.calculaKmRodados(this);
	}
	
	//resolver esse trem doido aqui
	public void alteraSalarioPorKm(double salarioPorKm) throws SalarioExcedidoException {
		if (salarioPorKm > 1) {
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
