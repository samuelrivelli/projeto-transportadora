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
	public double calculaSalario() {
		Double salarioCalculado = null;
		
		try {
			if (salario < Movimentacao.calculaKmRodados(this)) {
				throw new SalarioExcedidoException("O salario nao pode exceder a quantiade de km rodados");
			}
			else {
				salarioCalculado = this.salario;
			}
		}
		catch (SalarioExcedidoException e) {
			e.printStackTrace();
		}
		
		if(salarioCalculado != null) {
			return salarioCalculado;
		}
		else {
			return 0;
		}

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
