package entities;

public class Tratamento {
	
	public static String getTratamento(Motorista motorista) {
		
		String[] nomeCompleto = motorista.getNome().split(" ");
		String sobrenome = nomeCompleto[1];
		
		if(motorista.getSexo()) {
			return "Senhor " + sobrenome;
		}
		else {
			return "Senhora "+ sobrenome;
		}
	}
}
