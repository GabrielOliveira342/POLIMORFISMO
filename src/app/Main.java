package app;

import model.Professor;
import model.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Professor Professor = new Professor("Daniel Ohata", "daniel.ohata@facens.br");
		Aluno Aluno = new Aluno ("Gabriel Alberto", "gabriel.alberto@gmail.com");

		Professor.enviarEmail("Mensagem importatne para o professor");
		
		System.out.println();
		
		Aluno.enviarEmail("Mensagem importante para o aluno, sobre a nota da AC2");
	}

}
