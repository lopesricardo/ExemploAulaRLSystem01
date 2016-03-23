import java.io.File;
import java.io.FileWriter;

public class Cliente {
	
	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	private int idade;
	
	public String salvar() {
		File fl = new File("d:\\Projetos\\eclipse\\workspace\\ExemploAula\\repositorio\\testeJava.txt");
		
		if (!fl.exists())
		{
			try
			{
				fl.createNewFile();
			}
			catch(Exception ex){
				return "Erro: " + ex.getMessage();
			}
		}
		
		try {
			FileWriter writer = new FileWriter(fl);
			writer.write(this.nome + " - " + this.idade);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			return "Erro: " + e.getMessage();
		}
		
		return "Sucesso ao cadastrar";
	}
}
