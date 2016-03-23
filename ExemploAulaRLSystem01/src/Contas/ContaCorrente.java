package Contas;

//final - não permite que a classe seja herdada
public final class ContaCorrente extends Conta {
	private static int jurosSaque = 1;

	@Override
	public void sacar(double valor){
		if (this.saldo >= (valor + this.jurosSaque))
		{
			super.sacar(valor);
			this.juro();
		}
		else
		{
			System.out.println("Saque no valor de R$" + valor + " (juros de R$ " + this.jurosSaque +") não permitido. Saldo insuficiente...");
		}
	}
	
	public void VerSaldo()
	{
		super.VerSaldo();
		this.juro();
	}
	
	@Override
	protected void juro() {
		this.saldo -= this.jurosSaque; //juro	
	}
}
