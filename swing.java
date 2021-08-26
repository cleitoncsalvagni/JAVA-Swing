import javax.swing.JOptionPane;


public class swing {
	public static void main(String[] args) {
		
		double calculo;
		
		String numero = JOptionPane.showInputDialog("Digite o numero: ");
		int numero1 = Integer.parseInt(numero);
		calculo = Math.sqrt(numero1);
		JOptionPane.showMessageDialog(null, "O resultado foi: " + calculo, "Calculo da Raiz", JOptionPane.WARNING_MESSAGE);
		System.exit(3);
	}

}


