package model;

public class Aluno extends Pessoa{

	public Aluno (String nome, String email) {
		super(nome, email);
	}
	@Override
	public void enviarEmail(String mensagem) {
		String inico = "Olá Aluno, "+ getNome()+ "!\n";
		System.out.println(inico + mensagem);
	}
}
