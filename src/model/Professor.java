package model;

public class Professor extends Pessoa{

	public Professor(String nome, String email) {
		super(nome, email);
	}

	@Override
	public void enviarEmail(String mensagem) {
		String inicio = "Olá Prof. "+getNome()+ "!\n";
		System.out.println(inicio + mensagem);
	}
}
