
public class MySQL implements Idb{

	@Override
	public void conectar() {
		System.out.println("Conectao ao MySql");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectao ao MySql");
		
	}

}
