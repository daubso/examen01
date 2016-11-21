import java.util.Scanner;

/*
 * CSI Florida
 * Reto Putadon
 * 
 * El siguiente código busca una letra dentro de una frase
 * y devuelve dónde se ha encontrado y ctas veces
 * 
 * Hay dos errores
 * 
 */
public class Putadon {
	
	public static void main(String[] args) {
		//Variables inicialización
		String frase="";
		int numPos = 0;
		int numRepeticiones=0;
		char letra=0;
		//Pedimos datos
		introduceFrase("");
		letraBuscar(letra);
		//Buscamos las letras
		buscaLetras(frase, letra, numRepeticiones, numPos);
	}
	
	public static String introduceFrase(String frase){
		Scanner sc=new Scanner(System.in);
		imprimir("Introduce tu frase");
		frase = sc.nextLine();
		return frase;
	}
	public static char letraBuscar(char letra){
		Scanner sc=new Scanner(System.in);
		imprimir("Introduce la letra a buscar");
		letra = sc.nextLine().charAt(0);
		return letra;
	}
	public static void imprimir(String msg){
		System.out.println(msg);
		
	}
	public static void buscaLetras(String frase,char letra,int numRepeticiones, int numPos){
		for(int i=0;i<frase.length();i++){
			
				letra=frase.charAt(i+1);
				numRepeticiones=numRepeticiones+1;
				numPos=numPos+letra;
				imprimir("Letra "+letra+" encontrada en la posicion "+numPos);
			
		}
		imprimir("Letra "+letra+" encontrada en la posicion "+numPos);
		imprimir("Total repeticiones "+numRepeticiones);
	}
}
