package testesMotorista;

import java.time.LocalDate;

import entities.Motorista;
import entities.MotoristaAssalariado;
import entities.MotoristaEventual;
import entities.Movimentacao;
import entities.Tratamento;
import entities.Veiculo;
import entities.Viagem;
import excecoes.SalarioExcedidoException;

public class TesteMotoristaAssalariado {

	public static void main(String[] args) throws SalarioExcedidoException   {
		
		LocalDate data = LocalDate.now();
		
		Motorista motorista1 = new MotoristaAssalariado("Sergio Silva", "sergio@email.com",true,1500);
		Motorista motorista2 = new MotoristaAssalariado("Maria Teixeira", "maria@email.com",false,2300);
		
		Veiculo veiculo1 = new Veiculo("xxx-9999", 45000);
		
		Viagem viagem1 = new Viagem(motorista1, veiculo1, 5, 1200,data, 60);
		Viagem viagem2 = new Viagem(motorista2, veiculo1, 5, 1300, data, 60);
		
		Movimentacao.addViagem(viagem1);
		Movimentacao.addViagem(viagem2);
	
		System.out.println(motorista1.toString());
		
		System.out.println();
		
		System.out.println("Salario motorista 1: "+ motorista1.calculaSalario());
		System.out.println();
		
		System.out.println("Copia motorista : "+motorista1.copiaMotorista());
		
		
		
	}

}
