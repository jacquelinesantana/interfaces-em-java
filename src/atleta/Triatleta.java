package atleta;
//observe que estamos extendendo a primeira classe e estamos implementando as demais interfaces pois uma classe não pode
//receber mais de um extends
public class Triatleta extends Pessoa implements ICorredor, INadador  {
	
	public Triatleta(String nome) {
		super(nome);
	}
	
	@Override
	public void correr() {
		System.out.println("Estou correndo");
	}
	
	@Override
	public void aquecer() {
		System.out.println("Pulando corda para aquecer");
	}
	
	public void nadar() {
		System.out.println("Estou nadando...");
	}
}
