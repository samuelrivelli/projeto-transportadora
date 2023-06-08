package TestesMotorista;

import Entities.IdentificadorDeMotorista;
import Entities.Motorista;
import Entities.MotoristaAssalariado;
import Entities.MotoristaEventual;

public class TesteIdentificadorDeMotorista {

	public static void main(String[] args) {
		Motorista motorista1 = new MotoristaEventual("Sergio Pereira", "sergio@email.com",true,30);
		Motorista motorista2 = new MotoristaAssalariado("Maria Silva", "Maria@email.com",false,400);
	
		System.out.println(IdentificadorDeMotorista.identificarTipoMotorista(motorista1));
		
		System.out.println(IdentificadorDeMotorista.identificarTipoMotorista(motorista2));
	
		}

}
