package Exercicios;
import javax.swing.JOptionPane;

public class Exerc_3 {

	public static void main(String[] args) {


		String aux = "";
				
		int a, b, c;
				
		try {
				JOptionPane.showMessageDialog(null, "Digite alguns valores a seguir ");
				
				aux = JOptionPane.showInputDialog("Digite o valor de A: ");
				a = Integer.parseInt(aux);
				
				aux = JOptionPane.showInputDialog("Digite o valor de B: ");
				b = Integer.parseInt(aux);

				aux = JOptionPane.showInputDialog("Digite o valor de C: ");
				c = Integer.parseInt(aux);
				aux = "";
				
				
				do{aux=aux+a+" ";a = a + b; c--;
				}while(c>0);
				
				JOptionPane.showMessageDialog(null,aux);	
				}
				catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Informe um valor válido!");
						}
	}
}
