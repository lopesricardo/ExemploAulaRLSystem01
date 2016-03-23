
import javax.swing.JOptionPane;

import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;

public class Main {
	public static void main(String args[]) {
		/*
		 * System.out.println(String.format("Teste %d", 1));
		 * 
		 * Carro carro1 = new Carro("Fox"); carro1.ligar();
		 * 
		 * Carro carro2 = new Carro("Palio"); carro2.ligado = true;
		 * carro2.desligar();
		 */

		/*
		 * int[] numeros = {1,2,3};
		 * 
		 * for (int i = 0; i < numeros.length; i++) {
		 * System.out.println(numeros[i]); }
		 */

		// String[] times = {"Flamengo", "Corinthians", "Palmeiras"};

		/*
		 * for (int i = 0; i < times.length; i++) {
		 * System.out.println(times[i]); }
		 */

		/*
		 * for (String time : times) { System.out.println(time); }
		 */

		/*
		 * int count = 0; while (count <= 100) { System.out.println(count);
		 * count++; }
		 */

		System.out.println("-------------------------------\nConta corrente:");
		ContaCorrente contacorrente = new ContaCorrente();
		contacorrente.depositar(100);
		contacorrente.VerSaldo();
		contacorrente.sacar(99);
		contacorrente.VerSaldo();

		System.out.println("-------------------------------\nPoupança:");
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.depositar(500);
		contaPoupanca.VerSaldo();
		contaPoupanca.sacar(150);
		contaPoupanca.VerSaldo();
		// contaPoupanca.saldo -- está visível pq estamos no mesmo package
		// mudei as classes de contas para outro package e realmente o atributo
		// 'saldo' parou de aparecer aqui nessa classe.

		Conta conta; // classe abstrara que nao pode ser instanciada.

		String acao = JOptionPane.showInputDialog("Digite letra 'c' para conta corrente e\n 'p' para conta poupança.");

		// exemplo de polimorfismo
		if (acao.equals("c"))
			conta = new ContaCorrente();
		else
			conta = new ContaPoupanca();

		conta.depositar(100);
		conta.sacar(20);
		conta.VerSaldo();

		/*
		 * MySQL mysql = new MySQL(); mysql.conectar(); mysql.desconectar();
		 */

		// exemplo interfaces
		Idb db;

		String acao2 = JOptionPane.showInputDialog("M - Mysql; O - Oracle");

		if (acao2.equals("M"))
			db = new MySQL();
		else
			db = new Oracle();

		db.conectar();
		db.desconectar();

	}
}
