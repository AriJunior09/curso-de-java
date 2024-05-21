package transferencias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
	private static List<Transferencia> transferencias = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcao;
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Adicionar Transferência");
			System.out.println("2. Remover Transferência");
			System.out.println("3. Ordenadar por Loja de Origem");
			System.out.println("4. Ordenadar por Loja de Destino");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				adicionarTransferencia(scanner);
				break;
			case 2:
				removerTransferencia(scanner);
				break;
			case 3:
				mostrarTransferenciasOrdenadasPorOrigem();
				break;
			case 4:
				mostrarTransferenciasOrdenadasPorDestino();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida. Por favor, escolha novamente.");
				break;
			}
		} while (opcao != 0);

		scanner.close();
	}

	private static void adicionarTransferencia(Scanner scanner) {
		System.out.print("Número do arquivo: ");
		int numeroArquivo = scanner.nextInt();
		scanner.nextLine();  // Limpar o buffer do scanner

		System.out.print("Loja de origem: ");
		String lojaOrigem = scanner.nextLine();

		System.out.print("Loja de destino: ");
		String lojaDestino = scanner.nextLine();

		Transferencia transferencia = new Transferencia(numeroArquivo, lojaOrigem, lojaDestino);
		transferencias.add(transferencia);

		System.out.println("Transferência adicionada com sucesso.");
	}

	private static void removerTransferencia(Scanner scanner) {
		System.out.print("Número do arquivo a ser removido: ");
		int numeroArquivo = scanner.nextInt();
		scanner.nextLine();  // Limpar o buffer do scanner

		boolean removido = transferencias.removeIf(t -> t.getNumeroArquivo() == numeroArquivo);
		if (removido) {
			System.out.println("Transferência removida com sucesso.");
		} else {
			System.out.println("Nenhuma transferência encontrada com o número do arquivo especificado.");
		}
	}

	private static void mostrarTransferenciasOrdenadasPorOrigem() {
		if (transferencias.isEmpty()) {
			System.out.println("Nenhuma transferência registrada.");
		} else {
			// Ordena as transferências por loja de origem
			Collections.sort(transferencias, Comparator.comparing(Transferencia::getLojaOrigem));

			System.out.println("\nOrdenadado por Loja de origem:");
			for (Transferencia transferencia : transferencias) {
				System.out.println(transferencia);
			}
		}
	}

	private static void mostrarTransferenciasOrdenadasPorDestino() {
		if (transferencias.isEmpty()) {
			System.out.println("\nNenhuma transferência registrada.");
		} else {
			// Ordena as transferências por loja de destino
			Collections.sort(transferencias, Comparator.comparing(Transferencia::getLojaDestino));

			System.out.println("\nOrdenadado por por Loja de destino:");
			for (Transferencia transferencia : transferencias) {
				System.out.println(transferencia);
			}
		}
	}
}
