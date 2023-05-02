package parcialA;
import java.util.Scanner;
public class Punto_1 {

	public static void main(String[] args) {

		Scanner conectaTeclado = new Scanner (System.in);
		System.out.println("Ingresa la palabra");
		String palabra = conectaTeclado.nextLine();
		String encriptada = "";
		String [] vectorBuscar = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
		String [] vectorAscender = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"};
		String [] vectorDesciende = {"99","98","97","96","95","94","93","92","91","90","89","88","87","86","85","84","83","82","81","80","79","78","77","76","75","74"};
		for (int i = 0; i < palabra.length();i++) {
			String letra = palabra.substring(i, i+1);
			for(int j = 0; j < vectorBuscar.length; j++) {
				String coincidencia = vectorBuscar[j];
				if (letra.equals(coincidencia)) {
					if (i%2==0) {
						encriptada = encriptada + vectorDesciende[j]+ " -";
					}else {
						encriptada = encriptada + vectorAscender[j]+ " -";
					}
				}
			}
		}System.out.println(encriptada);
	}

}
