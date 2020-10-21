package estatica;

import javax.swing.JOptionPane;

import model.Curso;

public class Main {

	public static void main(String[] args) {
		Curso curso;
		int opc = 0;
		ListaEstatica cursos = new ListaEstatica();
		String id, nome, area, periodo;
		int semestres, posicao;
		String retornoPercorre;
		
		while(opc != 99) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adiciona inicio \n2 - Adiciona final \n3 - Adiciona posicao \n4 - Remove inicio \n5 - Remove final \n6 - Remove posicao \n7 - Exibir \n99 - Sair"));
			
			switch(opc) {
			case 1: id = JOptionPane.showInputDialog("Digite o ID do curso");
					nome = JOptionPane.showInputDialog("Digite o nome do curso");
					area = JOptionPane.showInputDialog("Digite a area do curso");
					semestres = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semestres do curso"));
					periodo = JOptionPane.showInputDialog("Digite o periodo do curso");
					curso = new Curso(id, nome, area, semestres, periodo);
					cursos.AdicionaInicio(curso);
			break;
			case 2: id = JOptionPane.showInputDialog("Digite o ID do curso");
					nome = JOptionPane.showInputDialog("Digite o nome do curso");
					area = JOptionPane.showInputDialog("Digite a area do curso");
					semestres = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semestres do curso"));
					periodo = JOptionPane.showInputDialog("Digite o periodo do curso");
					curso = new Curso(id, nome, area, semestres, periodo);
					cursos.AdicionaFinal(curso);
			break;
			case 3: id = JOptionPane.showInputDialog("Digite o ID do curso");
					nome = JOptionPane.showInputDialog("Digite o nome do curso");
					area = JOptionPane.showInputDialog("Digite a area do curso");
					semestres = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semestres do curso"));
					periodo = JOptionPane.showInputDialog("Digite o periodo do curso");
					curso = new Curso(id, nome, area, semestres, periodo);
					posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
					cursos.AdicionaQualquerPosicao(curso, posicao);
			break;
			case 4: curso = cursos.RemoveInicio();
					System.out.println("Curso: " + curso + " removido!");
			break;
			case 5: curso = cursos.RemoveFinal();
					System.out.println("Curso: " + curso.getNome() + " removido!");
			break;
			case 6: posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
					curso = cursos.RemoveQualquerPosicao(posicao);
					System.out.println("Curso: " + curso.getNome() + " removido!");
			break;
			case 7: retornoPercorre = cursos.percorre();
					System.out.println(retornoPercorre);
			break;
			case 99: System.exit(0);
			break;
			}
		}

	}

}
