import java.util.Scanner;
import java.lang.Math;

public class Prog1_0 {

	public static void main(String[] args) {

		Scanner leerradio = new Scanner(System.in);
		int radio;
		System.out.println("Introduce el radio de la esfera");
		radio = leerradio.nextInt();
		double longitud; 
		longitud = 2 * (Math.PI)* radio;
		System.out.println("La longitud de la circunferencia cuyo radio"+radio+" es "+longitud); 
		System.out.println("Finalizado Version 3"); 
	}

}
