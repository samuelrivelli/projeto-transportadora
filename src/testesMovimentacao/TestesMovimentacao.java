package testesMovimentacao;

import java.time.LocalDate;

import entities.Motorista;
import entities.MotoristaAssalariado;
import entities.MotoristaEventual;
import entities.Movimentacao;
import entities.Veiculo;
import entities.Viagem;

public class TestesMovimentacao {

	public static void main(String[] args) {

		LocalDate data = LocalDate.now();

		Motorista motorista1 = new MotoristaAssalariado("Sergio", "sergio@email",true, 4500);
		Motorista motorista2 = new MotoristaEventual("Pedro", "pedro@email",true);
		
		Veiculo veiculo1 = new Veiculo("placa-teste", 45000);
		Veiculo veiculo2 = new Veiculo("placa-teste2", 45000);

		Viagem viagem1 = new Viagem(motorista1, veiculo1, 19, 1000, data, 60);
		Viagem viagem2 = new Viagem(motorista2, veiculo2, 25, 980, data, 250);
		Viagem viagem3 = new Viagem(motorista1, veiculo2, 12, 326, data, 50);
		
		Movimentacao.addViagem(viagem1);
		Movimentacao.addViagem(viagem2);
		Movimentacao.addViagem(viagem3);
	
		
		System.out.println("Faturamento total: " + Movimentacao.faturamentoTotal());
		System.out.println("Quantidade Viagens: " + Movimentacao.quantidadeViagens());
		
		Movimentacao.removeViagem(viagem3);
		System.out.println("Quantidade Viagens: " + Movimentacao.quantidadeViagens());
		
		System.out.println(Movimentacao.verificaViagem(viagem3));
		System.out.println(Movimentacao.verificaViagem(viagem2));
		
		
		
		
		

	}

}
