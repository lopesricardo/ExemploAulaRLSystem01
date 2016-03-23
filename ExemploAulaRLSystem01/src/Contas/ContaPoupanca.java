package Contas;

public final class ContaPoupanca extends Conta {

	@Override
	public void depositar(double valor)
	{
		super.depositar(valor);
		this.juro();
	}
	
	@Override
	protected void juro() {
		this.saldo +=1;
		
	}
}
