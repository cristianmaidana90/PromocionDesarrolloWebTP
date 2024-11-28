package JuegoPractico;

	import javax.swing.JOptionPane;

	public class Main {

		public static void main(String[] args) {
			
			int numero,aleatorio, contador = 0;	
			aleatorio = (int) (Math.random()*100);
			
			boolean opciones = false;
			do {
				System.out.println("--- Bienvenidos al Juego de CristianMaidana");
				System.out.println("-- Empezamos ---");
				}while(opciones);
			
				do {
					
				numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero: "));
				if(aleatorio > numero) {
					System.out.println("Ingrese un Numero Mayor");	
				}
				else {
					System.out.println("Ingrese un Numero Menor");
				}
				contador++;
				
			} while(numero != aleatorio);

			System.out.println("\nAdivinaste!! el Numero " +contador+ " Intentos ");
		}

	}
