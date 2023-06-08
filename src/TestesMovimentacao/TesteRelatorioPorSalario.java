package TestesMovimentacao;

import java.time.LocalDate;

import Entities.Motorista;
import Entities.MotoristaAssalariado;
import Entities.MotoristaEventual;
import Entities.Movimentacao;
import Entities.Veiculo;
import Entities.Viagem;

public class TesteRelatorioPorSalario {

	public static void main(String[] args) {
		LocalDate data = LocalDate.now();

		Motorista motorista1 = new MotoristaAssalariado("Sergio", "sergio@email",true, 4500);
		Motorista motorista2 = new MotoristaEventual("Pedro", "pedro@email",true, 1);
		Motorista motorista3 = new MotoristaAssalariado("Abner", "abner@email",true, 3600);
		Motorista motorista4 = new MotoristaEventual("Bruno", "bruno@email",true, 0.8);
		
		Veiculo veiculo1 = new Veiculo("placa-teste", 45000);
		Veiculo veiculo2 = new Veiculo("placa-teste2", 45000);

		Viagem viagem1 = new Viagem(motorista1, veiculo1, 19, 1000, data, 1500);
		Viagem viagem2 = new Viagem(motorista2, veiculo2, 25, 980, data, 4000);
		Viagem viagem3 = new Viagem(motorista3, veiculo2, 12, 326, data, 3500);
		Viagem viagem4 = new Viagem(motorista4, veiculo2, 12, 2000, data, 6000);

		Movimentacao.addViagem(viagem1);
		Movimentacao.addViagem(viagem2);
		Movimentacao.addViagem(viagem3);
		Movimentacao.addViagem(viagem4);
		
		System.out.println("Relatorio por salario: ");
		System.out.println();
		Movimentacao.relatorioPorSalario();
		System.out.println();
		System.out.println();
	}

}
