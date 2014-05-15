import java.util.Scanner;


public class Tarea1 {

	public static void main(String[] args) {
		Scanner miscanner=new Scanner (System.in);

		System.out.println("Ingrese un numero:");
		Scanner mi_scanner= new Scanner (System.in);
		int numero=mi_scanner.nextInt();

		for (int z=1;z<11;z++)
		{
		System.out.println(numero*z);
		}
		}

	}


