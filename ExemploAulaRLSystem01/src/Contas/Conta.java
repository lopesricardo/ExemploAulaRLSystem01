package Contas;

//abstract - n�o pode ser instanciada, s� herdada
public abstract class Conta {
	protected double saldo;
	public int conta;
	
	public void sacar(double valor){
		if (this.saldo >= valor) this.saldo -= valor;
		else System.out.println("Saldo insuficiente...");
	}
	
	public void depositar(double valor){
		this.saldo += valor;
		
		if (valor == 100) System.out.println("A crise n�o veio pra voc�... parab�ns!");
	}
	
	public void VerSaldo()
	{
		System.out.println("Saldo: " + this.saldo);
	}
	
	protected abstract void juro();
}
