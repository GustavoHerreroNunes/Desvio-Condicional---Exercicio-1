package Exercicios;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		int N = Integer.parseInt(JOptionPane.showInputDialog("Insira seu valor"));
		if (N < 15) {
			JOptionPane.showMessageDialog(null, "Seu valor é menor que 15");
		}else if (N > 100) {
			JOptionPane.showMessageDialog(null, "Seu valor maior que 100");
		}else if (N == 15) {
			JOptionPane.showMessageDialog(null, "Seu valor é igual a 15");
		}
		else {
			JOptionPane.showMessageDialog(null, "Seu valor é igual a 100");
		}
	}

}
