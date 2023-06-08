package Entities;

public abstract class Motorista {
	private String nome;
	private String email;
	private String codigoIdentificador;
	private Boolean sexo;
	private static int contador = 0;

	public Motorista() {

	}

	public Motorista(String nome, String email, Boolean sexo) {
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		contador++;
		this.codigoIdentificador = "MOTO" + contador;

	}

	public Motorista(String nome, String email, String codigoIdentificador) {
		this.nome = nome;
		this.email = email;
		this.codigoIdentificador = codigoIdentificador;
	}

	public Motorista(Motorista motorista) {
		super();
		this.nome = motorista.nome;
		this.email = motorista.email;
	}

	public String getNome() {
		return new String(this.nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getSexo() {
		return this.sexo;
	}
	
	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodigoIdentificador() {
		return new String(this.codigoIdentificador);
	}

	public abstract double calculaSalario();

	public abstract Motorista copiaMotorista();

	public abstract String getDescricao();

	@Override
	public String toString() {
		return "Motorista: " + nome + "\nEmail: " + email + "\nCodigo Identificador: " + this.codigoIdentificador;
	}

}
