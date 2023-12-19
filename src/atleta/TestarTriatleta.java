package atleta;

public class TestarTriatleta {

	public static void main(String[] args) {
		// testando os metodos com interface
		/*
		 * interface permitiu que a classe Triatleta herde caracteristicas e métodos de mais de uma classe
		 * então aqui poderemos utilizar os métodos do correr que pertence ao corredor
		 * poderemos utilizar tbm o método da classe atleta que é o aquecer e poderemos utilizar todos os demais métodos 
		 * de classes e interfaces associadas a classe do Triatleta
		 */
		
		Triatleta t = new Triatleta("Jacque");
		
		t.correr();
		t.aquecer();
		t.nadar();

	}

}
