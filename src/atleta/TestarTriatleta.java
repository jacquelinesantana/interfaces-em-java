package atleta;

public class TestarTriatleta {

	public static void main(String[] args) {
		// testando os metodos com interface
		/*
		 * interface permitiu que a classe Triatleta herde caracteristicas e m�todos de mais de uma classe
		 * ent�o aqui poderemos utilizar os m�todos do correr que pertence ao corredor
		 * poderemos utilizar tbm o m�todo da classe atleta que � o aquecer e poderemos utilizar todos os demais m�todos 
		 * de classes e interfaces associadas a classe do Triatleta
		 */
		
		Triatleta t = new Triatleta("Jacque");
		
		t.correr();
		t.aquecer();
		t.nadar();

	}

}
