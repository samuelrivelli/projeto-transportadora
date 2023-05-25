package TestesMotorista;

import Entities.IdentificadorDeMotorista;
import Entities.Motorista;
import Entities.MotoristaAssalariado;
import Entities.MotoristaEventual;

public class TesteIdentificadorDeMotorista {

	public static void main(String[] args) {
		Motorista motorista1 = new MotoristaEventual("Sergio", "sergio@email.com",30);
		Motorista motorista2 = new MotoristaAssalariado("Sergio", "sergio@email.com",400);
	
		System.out.println(IdentificadorDeMotorista.identificarTipoMotorista(motorista1));
		
		System.out.println(IdentificadorDeMotorista.identificarTipoMotorista(motorista2));
	
		}

}
