package TestesViagem;

import java.time.LocalDate;

import Entities.Motorista;
import Entities.MotoristaAssalariado;
import Entities.Veiculo;
import Entities.Viagem;

public class TestesViagem {

	public static void main(String[] args) {

		LocalDate data = LocalDate.now();

		Motorista motorista1 = new MotoristaAssalariado("Sergio Cortez", "sergio@email.com",true,1600);
		
		Veiculo veiculo1 = new Veiculo("xxx-9999", 45000);

		Viagem viagem1 = new Viagem(motorista1, veiculo1, 5, 11, data, 60);

		System.out.println(viagem1.toString());
		System.out.println("Distancia percorrida: "+viagem1.distanciaPercorrida());
		
		
	}
}
