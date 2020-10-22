package pilha;

import javax.swing.JOptionPane;

import model.Curso;

public class Main {

	public static void main(String[] args) {
		Curso curso;
		int opc = 0;
		Pilha cursos = new Pilha();
		String id, nome, area, periodo;
		int semestres;
		String retornoPercorre;
		
		while(opc != 99) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adiciona final \n2 - Remove final \n3 - Exibir \n99 - Sair"));
			
			switch(opc) {
			case 1: id = JOptionPane.showInputDialog("Digite o ID do curso");
					nome = JOptionPane.showInputDialog("Digite o nome do curso");
					area = JOptionPane.showInputDialog("Digite a area do curso");
					semestres = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semestres do curso"));
					periodo = JOptionPane.showInputDialog("Digite o periodo do curso");
					curso = new Curso(id, nome, area, semestres, periodo);
					cursos.AdicionaFinal(curso);
			break;
			case 2: curso = cursos.RemoveFinal();
					System.out.println("Curso: " + curso.getNome() + " removido!");
			break;
			case 3: retornoPercorre = cursos.percorre();
					System.out.println(retornoPercorre);
			break;
			case 99: System.exit(0);
			break;
			}
		}

	}

}
