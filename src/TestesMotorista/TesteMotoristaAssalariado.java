package TestesMotorista;

import java.time.LocalDate;

import Entities.Motorista;
import Entities.MotoristaAssalariado;
import Entities.MotoristaEventual;
import Entities.Movimentacao;
import Entities.Tratamento;
import Entities.Veiculo;
import Entities.Viagem;
import Excecoes.SalarioExcedidoException;

public class TesteMotoristaAssalariado {

	public static void main(String[] args)  {
		
		LocalDate data = LocalDate.now();
		
		Motorista motorista1 = new MotoristaAssalariado("Sergio Silva", "sergio@email.com",true,1000);
		Motorista motorista2 = new MotoristaAssalariado("Maria Teixeira", "maria@email.com",false,1200);
		
		Veiculo veiculo1 = new Veiculo("xxx-9999", 45000);
		
		Viagem viagem1 = new Viagem(motorista1, veiculo1, 5, 70,data, 60);
		Viagem viagem2 = new Viagem(motorista2, veiculo1, 5, 1300, data, 60);
		
		Movimentacao.addViagem(viagem1);
		Movimentacao.addViagem(viagem2);
	
		System.out.println(motorista1.toString());
		
		System.out.println();
		
		System.out.println("Salario motorista 1: "+ motorista1.calculaSalario());
		System.out.println();
		
		System.out.println("Copia motorista : "+motorista1.copiaMotorista());
		
		System.out.println(Tratamento.getTratamento(motorista1));
		System.out.println(Tratamento.getTratamento(motorista2));
		
	}

}
