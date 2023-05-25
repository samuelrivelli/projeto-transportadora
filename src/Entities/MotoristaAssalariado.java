package Entities;

public class MotoristaAssalariado extends Motorista{
	
	private double salario;
	
	public MotoristaAssalariado(String nome, String email, double salario) {
		super(nome,email);
		this.salario = salario;
	}
	
	public MotoristaAssalariado(MotoristaAssalariado motoristaAssalariado) {
		super(motoristaAssalariado.getNome(),motoristaAssalariado.getEmail(), motoristaAssalariado.getCodigoIdentificador());
		this.salario = motoristaAssalariado.salario;
		
	}

	@Override
	public double calculaSalario() {
		return salario;
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
