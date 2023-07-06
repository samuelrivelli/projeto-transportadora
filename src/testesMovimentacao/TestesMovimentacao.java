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

		Motorista motorista1 = new MotoristaAssalariado("Sergio", "sergio@email", true, 4500);
		Motorista motorista2 = new MotoristaEventual("Pedro", "pedro@email", true, 0.6);

		Veiculo veiculo1 = new Veiculo("placa-teste", 45000);
		Veiculo veiculo2 = new Veiculo("placa-teste2", 45000);

		Viagem viagem1 = new Viagem(motorista1, veiculo1, 19, 1000, data, 60);
		Viagem viagem2 = new Viagem(motorista2, veiculo2, 25, 980, data, 250);
		Viagem viagem3 = new Viagem(motorista1, veiculo2, 12, 326, data, 50);

		Movimentacao.getListaViagens().addElemento(viagem1);
		Movimentacao.getListaViagens().addElemento(viagem2);
		Movimentacao.getListaViagens().addElemento(viagem3);

		System.out.println("Faturamento total: " + Movimentacao.faturamentoTotal());
		System.out.println("Quantidade Viagens: " + Movimentacao.getListaViagens().quantidadeElementos());

		Movimentacao.getListaViagens().removeElemento(viagem3);
		System.out.println("Quantidade Viagens: " + Movimentacao.getListaViagens().quantidadeElementos());

		System.out.println("Essa viagem existe ? " + Movimentacao.getListaViagens().verificaExistencia(viagem3));
		System.out.println("Essa viagem existe ? "+  Movimentacao.getListaViagens().verificaExistencia(viagem2));

	}

}
