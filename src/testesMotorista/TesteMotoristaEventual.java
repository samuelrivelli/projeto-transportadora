package testesMotorista;

import java.time.LocalDate;

import entities.MotoristaEventual;
import entities.Movimentacao;
import entities.Veiculo;
import entities.Viagem;
import excecoes.SalarioExcedidoException;

public class TesteMotoristaEventual {
	public static void main(String[] args) {

		LocalDate data = LocalDate.now();

		MotoristaEventual motorista1 = new MotoristaEventual("Sergio Vilela", "sergio@email.com", true);
		try {
			motorista1.alteraSalarioPorKm(1.4);
		} catch (SalarioExcedidoException e) {

			System.out.println(e.getMessage());
		}
		Veiculo veiculo1 = new Veiculo("xxx-9999", 45000);

		Viagem viagem1 = new Viagem(motorista1, veiculo1, 5, 10, data, 60);
		Viagem viagem2 = new Viagem(motorista1, veiculo1, 5, 20, data, 60);

		Movimentacao.addViagem(viagem1);
		Movimentacao.addViagem(viagem2);

		System.out.println(viagem1.toString());
		System.out.println("Distancia percorrida: " + viagem1.distanciaPercorrida());
		System.out.println();
		System.out.println(motorista1.toString());
		System.out.println();
		System.out.println("Copia motorista: " + motorista1.copiaMotorista());

		System.out.println();

		try {
			System.out.println("Salario do motorista eventual 1: " + motorista1.calculaSalario());
		} catch (SalarioExcedidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
