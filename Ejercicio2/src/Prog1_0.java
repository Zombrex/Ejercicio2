import java.util.Scanner;
import java.lang.Math;

public class Prog1_0 {

	public static void main(String[] args) {
		double volumen;
		Scanner leerradio = new Scanner(System.in);
		int radio;
		System.out.println("Introduce el radio de la esfera");
		radio = leerradio.nextInt();
		volumen = (4 * (Math.PI) * (Math.pow(radio,3))/3);
		System.out.println("El volumen de la esfera cuyo radio "+radio+" es " + volumen); 
				System.out.println("Finalizado Version 1"); 

	}

}
