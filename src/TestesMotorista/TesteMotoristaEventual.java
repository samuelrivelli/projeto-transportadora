package TestesMotorista;

import java.time.LocalDate;

import Entities.Motorista;
import Entities.MotoristaEventual;
import Entities.Movimentacao;
import Entities.Veiculo;
import Entities.Viagem;
import Excecoes.SalarioExcedidoException;

public class TesteMotoristaEventual {
	public static void main(String[] args) throws SalarioExcedidoException  {
		
		LocalDate data = LocalDate.now();

		Motorista motorista1 = new MotoristaEventual("Sergio Vilela", "sergio@email.com",true,1);
		
		Veiculo veiculo1 = new Veiculo("xxx-9999", 45000);

		Viagem viagem1 = new Viagem(motorista1, veiculo1, 5, 10, data, 60);
		Viagem viagem2 = new Viagem(motorista1, veiculo1, 5, 20, data, 60);
		
		Movimentacao.addViagem(viagem1);
		Movimentacao.addViagem(viagem2);

		System.out.println(viagem1.toString());
		System.out.println("Distancia percorrida: "+viagem1.distanciaPercorrida());
		System.out.println();
		System.out.println(motorista1.toString());
		System.out.println();
		System.out.println("Copia motorista: " +motorista1.copiaMotorista());
		
		System.out.println();
		
		System.out.println("Salario do motorista eventual 1: "+ motorista1.calculaSalario());
	

		
	}

	
}
