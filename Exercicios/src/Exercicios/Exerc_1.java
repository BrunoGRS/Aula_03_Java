package Exercicios;
import javax.swing.JOptionPane;

public class Exerc_1 {

	public static void main(String[] args) {

										
				String aux = "";				
				float media;
										
				aux = JOptionPane.showInputDialog("Escrava o valor da prova 1 -> ");
				float nota1 = Float.parseFloat(aux);
										
				aux = JOptionPane.showInputDialog("Escrava o valor da prova 2 -> ");
				float nota2 = Float.parseFloat(aux);
										
				aux = JOptionPane.showInputDialog("Escrava o valor da prova 3 -> ");
				float nota3 = Float.parseFloat(aux);
													
				media = (nota1 + nota2 + nota3 ) / 3;
										
				JOptionPane.showMessageDialog(null, "A média do aluno nas provas foi: " +  media);
										
							
	}
}


