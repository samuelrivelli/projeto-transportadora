package TestesMotorista;

import Entities.Motorista;
import Entities.MotoristaAssalariado;
import Entities.MotoristaEventual;

public class TesteMotoristaAssalariado {

	public static void main(String[] args) {
		
		Motorista motorista1 = new MotoristaAssalariado("Sergio", "sergio@email.com",1200);
		
	
		System.out.println(motorista1.toString());
		
		System.out.println();
		
		System.out.println("Salario motorista 1: "+ motorista1.calculaSalario());
		System.out.println();
		
		System.out.println("Copia motorista : "+motorista1.copiaMotorista());
		
	}

}
