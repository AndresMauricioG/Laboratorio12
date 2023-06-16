import javax.swing.*;

public class Numeros {
	int numer;
	int i,neg=0, par=0;
	
	public void entrada() {
		for(i=0;i<5;i++) {
			numer=ingresarDatos("digite 1 numero");
			if(numer%2==0) {
				par++;
			}
			
			if(numer<0) {
				neg++;
			}
		}
		JOptionPane.showMessageDialog(null, "el numero de numero paares es: "+par+ "\n"
				+"el numero de numero negativos es"+par);
	}
	
	public static int ingresarDatos(String mensaje) {
		String cadena;
		int valor;
		cadena=JOptionPane.showInputDialog(null, mensaje);
		valor=Integer.parseInt(cadena);
		return valor;
	}
}
