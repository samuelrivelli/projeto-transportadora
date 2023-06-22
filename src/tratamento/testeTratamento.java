package tratamento;

import entities.Motorista;
import entities.MotoristaAssalariado;
import entities.Tratamento;

public class testeTratamento {

	public static void main(String[] args) {

		Motorista motorista1 = new MotoristaAssalariado("Sergio Silva", "sergio@email.com", true, 1000);
		Motorista motorista2 = new MotoristaAssalariado("Maria Teixeira", "maria@email.com", false, 1200);

		System.out.println(Tratamento.getTratamento(motorista1));
		System.out.println(Tratamento.getTratamento(motorista2));
	}
}
