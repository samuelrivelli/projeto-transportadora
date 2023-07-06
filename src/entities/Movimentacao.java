package entities;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.List;

public class Movimentacao {

	private static ListaGenerica<Viagem> listaViagens = new ListaGenerica<Viagem>();

	public Movimentacao() {

		listaViagens = new ListaGenerica<Viagem>();

	}

	public static ListaGenerica<Viagem> getListaViagens() {
		return listaViagens;
	}

	public static double faturamentoTotal() {

		double soma = 0;

		for (Viagem viagem : listaViagens) {

			soma += viagem.getValorCobrado();

		}

		return soma;

	}

	public static int calculaKmRodados(Motorista motorista) {

		if (listaViagens == null) {

			listaViagens = new ListaGenerica<Viagem>();

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

	public static void relatorioPorValorDaViagem() {

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
