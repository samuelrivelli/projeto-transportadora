package Entities;

import Excecoes.SalarioExcedidoException;

public class MotoristaEventual extends Motorista {

	private double salarioPorViagem;

	public MotoristaEventual(String nome, String email, Boolean sexo, double salarioPorViagem) {
		super(nome, email, sexo);
		this.salarioPorViagem = salarioPorViagem;

	}

	public MotoristaEventual(MotoristaEventual motoristaEventual) {
		super(motoristaEventual.getNome(), motoristaEventual.getEmail(), motoristaEventual.getCodigoIdentificador());
		this.salarioPorViagem = motoristaEventual.salarioPorViagem;
	}

	@Override
	public double calculaSalario() {
		Double salarioCalculado = salarioPorViagem * Movimentacao.calculaKmRodados(this);
		Double salarioTotal = null;

		try {
			if (salarioCalculado > Movimentacao.calculaKmRodados(this)) {
				throw new SalarioExcedidoException("O salario nao pode exceder a quantiade de km rodados");
			}
			else {
				salarioTotal = salarioCalculado;
			}
		} catch (SalarioExcedidoException e) {
			e.printStackTrace();
		}

		if (salarioTotal != null) {
			return salarioCalculado;
		} else {
			return 0;
		}

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
