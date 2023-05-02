package parcialA;
import java.util.Scanner;
public class Punto_1 {

	public static void main(String[] args) {

		Scanner conectaTeclado = new Scanner (System.in);
		System.out.println("Ingresa la palabra");
		String palabra = conectaTeclado.nextLine(); //Variable para pedir la palabra
		String encriptada = ""; //Variable para agregar lo que se forma a medida que se encripta
		//Vector de ABC comun
		String [] vectorBuscar = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
		//Vector que asciende 0-27
		String [] vectorAscender = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"};
		//Vector que desciende 99-74
		String [] vectorDesciende = {"99","98","97","96","95","94","93","92","91","90","89","88","87","86","85","84","83","82","81","80","79","78","77","76","75","74"};
		for (int i = 0; i < palabra.length();i++) { //Ciclo para recorrer la palabra letra por letra
			String letra = palabra.substring(i, i+1); // Variable para tomar la letra
			for(int j = 0; j < vectorBuscar.length; j++) { //Ciclo para recorrer vector ABC
				String coincidencia = vectorBuscar[j]; //Variable para poder comparar la letra con las del ABC
				if (letra.equals(coincidencia)) { //Si la letra y la del vector coinciden
					if (i%2==0) { //Condicional para evaluar si la letra en la palabra tiene posicion par o no
						encriptada = encriptada + vectorDesciende[j]+ " -"; /* si es par, la letra se remplaza
						por la posicion del ABC equivalente por la del vector Descendente*/
					}else { /*Si no es par, la letra es remplaza por la posicion del ABC equivalente en el
					vector Asciende*/
						encriptada = encriptada + vectorAscender[j]+ " -";
					}
				}
			}
		}System.out.println(encriptada); //Muestra la palabra ya encriptada
	}

}
