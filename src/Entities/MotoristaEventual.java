package Entities;

import Excecoes.SalarioExcedidoException;

public class MotoristaEventual extends Motorista {

	private double salarioPorKm;

	public MotoristaEventual(String nome, String email, Boolean sexo, double salarioPorViagem) {
		super(nome, email, sexo);
		this.salarioPorKm = salarioPorViagem;

	}

	public MotoristaEventual(MotoristaEventual motoristaEventual) {
		super(motoristaEventual.getNome(), motoristaEventual.getEmail(), motoristaEventual.getCodigoIdentificador());
		this.salarioPorKm = motoristaEventual.salarioPorKm;
	}

	@Override
	public double calculaSalario() throws SalarioExcedidoException {

		if (this.salarioPorKm > 1) {
			throw new SalarioExcedidoException("O salario nao pode exceder a quantiade de km rodados");
		}
		return salarioPorKm * Movimentacao.calculaKmRodados(this);

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
