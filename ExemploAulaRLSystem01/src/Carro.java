import javax.swing.JOptionPane;

public class Carro {

	//atributos
	private String marca;
	public int ano;
	private int marcha = 0;
	public boolean ligado;
	public String nome;
	public int velocidade;
	public boolean freioDeMao = true;
	
	public Carro(String pnome)
	{
		this.nome = pnome;
	}
	
	//métodos
	public void ligar() {
		if (this.ligado == false)
		{
			System.out.println("Carro "+ this.nome+" ligado");
			//JOptionPane.showMessageDialog(null, "Blá");
			this.ligado = true;
			
		}
		else
		{
			System.out.println("Carro "+ this.nome+" já está ligado.");
		}	
	}
	
	public void desligar() {
		if (this.ligado == true)
		{
			System.out.println("Carro "+ this.nome+" deligado");
			this.ligado = false;
		}
		else
		{
			System.out.println("Carro "+ this.nome+" já está desligado.");
		}
	}
	
	public void trocarMarcha() {
		System.out.println("Trocar marcha");
	}
	
	public void acelerar(int novaVelocidade)
	{
		if (novaVelocidade > this.velocidade && 
			this.ligado == true && 
			this.freioDeMao == false)
			this.velocidade = novaVelocidade;
		
		System.out.println("Velocidade atual: " + this.velocidade);
	}
}

