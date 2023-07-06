package testesMotorista;

import java.time.LocalDate;

import entities.Motorista;
import entities.MotoristaAssalariado;
import entities.Movimentacao;
import entities.Veiculo;
import entities.Viagem;

public class TesteCategoriaMotoristas {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();
		
		Motorista motorista1 = new MotoristaAssalariado("Sergio Silva", "sergio@email.com",true,1500);
		Motorista motorista2 = new MotoristaAssalariado("Maria Teixeira", "maria@email.com",false,2300);
		Motorista motorista3 = new MotoristaAssalariado("Pedro Almeida", "pedro@email.com",true,2300);
		Veiculo veiculo1 = new Veiculo("xxx-9999", 45000);
		
		Viagem viagem1 = new Viagem(motorista1, veiculo1, 5, 600000,data, 60);
		Viagem viagem2 = new Viagem(motorista2, veiculo1, 5, 1300, data, 60);
		Viagem viagem3 = new Viagem(motorista3, veiculo1, 5, 260000, data, 60);
		
		Movimentacao.getListaViagens().addElemento(viagem1);
		Movimentacao.getListaViagens().addElemento(viagem2);
		Movimentacao.getListaViagens().addElemento(viagem3);
		
		System.out.println("Categoria motorista 1:" + motorista1.getCategoria());
		System.out.println("Categoria motorista 2:" + motorista2.getCategoria());
		System.out.println("Categoria motorista 3:" + motorista3.getCategoria());
	
		
		
		
	}

}
