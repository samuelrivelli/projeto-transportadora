package Entities;

import java.util.ArrayList;

public class Movimentacao {

	private static ArrayList<Viagem> listaViagens;

	public Movimentacao() {
		listaViagens = new ArrayList<Viagem>();
	}

	public static double faturamentoTotal() {
		double soma = 0;

		for (Viagem viagem : listaViagens) {
			soma += viagem.getValorCobrado();
		}

		return soma;
	}

	public static int quantidadeViagens() {
		return listaViagens.size();
	}

	public static void addViagem(Viagem viagemX) {
		if (listaViagens == null) {
			listaViagens = new ArrayList<Viagem>();
		}
		listaViagens.add(viagemX);
	}

	public static void removeViagem(Viagem viagemX) {

		listaViagens.remove(viagemX);
	}

	public static String verificaViagem(Viagem viagemX) {
		if (listaViagens.contains(viagemX)) {
			return "Essa viagem ocorreu!";
		} else {
			return "Essa viagem nao ocorreu!";
		}
	}

	public static int calculaKmRodados(Motorista motorista) {
		int kmRodados = 0;
		for (Viagem viagem : listaViagens) {
			if (viagem.getMotorista().getCodigoIdentificador().equals(motorista.getCodigoIdentificador())) {
				kmRodados += viagem.distanciaPercorrida();
			}
		}
		return kmRodados;
	}

}
