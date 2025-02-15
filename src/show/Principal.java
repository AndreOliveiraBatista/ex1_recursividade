package show;

import javax.swing.JOptionPane;
import control.somaControl;

	public class Principal {
		public static void main(String[] args) {
			somaControl sc = new somaControl();
			
			int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor natural: "));
			int soma = sc.soma(n);
			System.out.println("A soma dos " + n + " primeiros números é igual a: " + soma);
		}
	}

