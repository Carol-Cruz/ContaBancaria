package conta;

import java.util.Scanner;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// testando a classe Conta
		Conta c1 = new Conta(9, 341, 1, "Carol", 500.00f);
		c1.visualizar();
		c1.sacar(250.00f);
		c1.visualizar();
		c1.depositar(100.00f);
		c1.visualizar();
		Conta c2 = new Conta(9, 341, 2, "Bia", 500.00f);
		c2.visualizar();
		c2.setSaldo(750.00f);
		c2.setTitular("Maria");
		c2.visualizar();
		
		// Teste da Classe Conta Corrente
				ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "João", 500.00f, 1000.0f);
				cc1.visualizar();
				cc1.sacar(2000.0f);
				cc1.visualizar();
				cc1.depositar(5000.0f);
				cc1.visualizar();
				
		        // Teste da Classe Conta Poupança
				ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria", 500.00f, 13);
				cp1.visualizar();
		        cp1.sacar(1000.0f);
				cp1.visualizar();
				cp1.depositar(5000.0f);
				cp1.visualizar();

		Scanner captura = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = captura.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				captura.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Carol Cruz - carol.karol@live.com");
		System.out.println("https://github.com/Carol-Cruz");
		System.out.println("*********************************************************");
	}
}
