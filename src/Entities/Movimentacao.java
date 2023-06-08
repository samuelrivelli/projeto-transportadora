package Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		if (listaViagens == null) {
			listaViagens = new ArrayList<Viagem>();
		}
		int kmRodados = 0;
		for (Viagem viagem : listaViagens) {
			if (viagem.getMotorista().getCodigoIdentificador().equals(motorista.getCodigoIdentificador())) {
				kmRodados += viagem.distanciaPercorrida();
			}
		}
		return kmRodados;
	}

	public static void relatorioPorNome() {

		Collections.sort(listaViagens, new Comparator<Viagem>() {
			public int compare(Viagem v1, Viagem v2) {
				return v1.getMotorista().getNome().compareTo(v2.getMotorista().getNome());
			}
		});

		for (Viagem viagem : listaViagens) {
			System.out.println(viagem.toString());
			System.out.println();
		}
	}
	
	public static void relatorioPorSalario() {
		Collections.sort(listaViagens, new Comparator<Viagem>() {
			public int compare(Viagem v1, Viagem v2) {
				return Double.compare(v2.getValorCobrado(), v1.getValorCobrado());
			}
		});

		for (Viagem viagem : listaViagens) {
			System.out.println(viagem.toString());
			System.out.println();
		}
	}
}
