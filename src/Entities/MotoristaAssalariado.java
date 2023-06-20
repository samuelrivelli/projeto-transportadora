package Entities;

import Excecoes.SalarioExcedidoException;

public class MotoristaAssalariado extends Motorista {

	private double salario;

	public MotoristaAssalariado(String nome, String email, Boolean sexo, double salario) {
		super(nome, email, sexo);
		this.salario = salario;
	}

	public MotoristaAssalariado(MotoristaAssalariado motoristaAssalariado) {
		super(motoristaAssalariado.getNome(), motoristaAssalariado.getEmail(),
				motoristaAssalariado.getCodigoIdentificador());
		this.salario = motoristaAssalariado.salario;

	}

	@Override
	public double calculaSalario() throws SalarioExcedidoException {

		if (salario < Movimentacao.calculaKmRodados(this)) {
			throw new SalarioExcedidoException("O salario nao pode exceder a quantiade de km rodados");
		}
		return this.salario;
	}

	@Override
	public Motorista copiaMotorista() {
		return new MotoristaAssalariado(this);
	}

	@Override
	public String getDescricao() {
		return "Motorista assalariado";
	}

}
