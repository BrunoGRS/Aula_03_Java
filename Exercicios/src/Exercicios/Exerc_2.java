package Exercicios;
import javax.swing.JOptionPane;

public class Exerc_2 {

	public static void main(String[] args) {

		String aux = "";
		float n1, n2, sum, sub, mult, div;
				
		JOptionPane.showMessageDialog(null, "Vou mostrar o resultado das quatro operações básicas com dois números de sua escolha, Vamos la?");
				
		aux = JOptionPane.showInputDialog("Indique o primeiro número");
		n1 = Float.parseFloat(aux);
				
		aux = JOptionPane.showInputDialog("Indique o segundo número");
		n2 = Float.parseFloat(aux);
				
		sum = n1+n2;
		sub = n1-n2;
		mult = n1*n2;
		div = n1/n2;
				
		JOptionPane.showMessageDialog(null, "O resultado das quatro operações com os número que você informou ficou assim...");
		JOptionPane.showMessageDialog(null, "Soma " + sum);
		JOptionPane.showMessageDialog(null, "Subtração " + sub);
		JOptionPane.showMessageDialog(null, "Multiplicação " + mult);
		JOptionPane.showMessageDialog(null, "Divisão " + div);
		JOptionPane.showMessageDialog(null, "Obrigado pelo uso:)");
				
	}
}
