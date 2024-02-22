import java.util.Arrays;
import java.util.Random;
public class VetorDecrescente {
	public static void main(String[] args) {
		System.out.println("Bem vindo ao programa de exercício de vetor! \n Iremos exercitar a ordenação do vetor em ordem decrescente referente a notas em uma turma de alunos!");
		System.out.println("Criando turma de alunos...");
		int notas[] = new int[10];
		System.out.println("A turma de alunos foi criada! Agora vamos atribuir notas para os alunos...");
		Random random = new Random();
		for(int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(11);
		}
		System.out.println("Atribuimos com sucesso notas para os alunos! Agora vamos listar as notas...");
		for(int a = 0; a < notas.length; a++) {
			System.out.println("Aluno " + (a + 1) + ", nota:  " + notas[a]);
		}
		System.out.println("A listagem foi concluída! Agora iremos organizar o vetor em ordem decrescente...");
		for(int i = 0;i < notas.length; i++) {

		    notas[i] = -notas[i];
		}
		Arrays.sort(notas);
		for(int i = 0; i < notas.length; i++) {
		    notas [i] = - notas[i]; 
		}
		for(int a = 0; a < notas.length; a++) {
			System.out.println("Aluno " + (a + 1) + ", nota:  " + notas[a]);
		}
	}
}
