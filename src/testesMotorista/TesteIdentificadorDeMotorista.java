package testesMotorista;

import entities.IdentificadorDeMotorista;
import entities.Motorista;
import entities.MotoristaAssalariado;
import entities.MotoristaEventual;

public class TesteIdentificadorDeMotorista {

	public static void main(String[] args) {
		Motorista motorista1 = new MotoristaEventual("Sergio Pereira", "sergio@email.com",true);
		Motorista motorista2 = new MotoristaAssalariado("Maria Silva", "Maria@email.com",false,400);
	
		System.out.println(IdentificadorDeMotorista.identificarTipoMotorista(motorista1));
		
		System.out.println(IdentificadorDeMotorista.identificarTipoMotorista(motorista2));
	
		}

}
