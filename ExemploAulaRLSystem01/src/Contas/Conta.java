package Contas;

//abstract - não pode ser instanciada, só herdada
public abstract class Conta {
	protected double saldo;
	public int conta;
	
	public void sacar(double valor){
		if (this.saldo >= valor) this.saldo -= valor;
		else System.out.println("Saldo insuficiente...");
	}
	
	public void depositar(double valor){
		this.saldo += valor;
		
		if (valor == 100) System.out.println("A crise não veio pra você... parabéns!");
	}
	
	public void VerSaldo()
	{
		System.out.println("Saldo: " + this.saldo);
	}
	
	protected abstract void juro();
}
