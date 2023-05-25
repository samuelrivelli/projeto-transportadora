package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Viagem {

	private Motorista motorista;
	private Veiculo veiculo;
	private int kmInicial;
	private int kmFinal;
	private LocalDate data;
	private double valorCobrado;
	

	public Viagem(Motorista motorista, Veiculo veiculo, int kmInicial, int kmFinal, LocalDate data,
			double valorCobrado) {
		super();
		this.motorista = motorista;
		this.veiculo = veiculo;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
		this.data = data;
		this.valorCobrado = valorCobrado;
		
	}

	public Motorista getMotorista() {
		return this.motorista.copiaMotorista();
		
	}

	public Veiculo getVeiculo() {
		return new Veiculo(this.veiculo);
	}

	public int getKmInicial() {
		return kmInicial;
	}

	public int getKmFinal() {
		return kmFinal;
	}

	// Ajustar para retornar uma copia de data
	public String getData() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return this.data.format(formato);
	}

	public double getValorCobrado() {
		return this.valorCobrado;
	}

	public double distanciaPercorrida() {
		if (this.kmFinal - this.kmInicial >= 0) {
			return this.kmFinal - this.kmInicial;
		}

		else {
			int distanciaPercorrida = (this.kmFinal - this.kmInicial) * -1;
			return distanciaPercorrida;
		}

	}

	@Override
	public String toString() {
		return "Motorista=" + motorista + "\nVeiculo=" + veiculo + "\nKmInicial=" + kmInicial + "\nKmFinal="
				+ kmFinal + "\nData=" + data + "\nValorCobrado=" + valorCobrado ;
	}

}
