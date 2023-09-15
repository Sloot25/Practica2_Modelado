import java.util.Scanner;

import State.Robot;

public class Main {
  public static void main(String[] args){
		Robot Patricio = new Robot();

		Scanner sc = new Scanner(System.in);
		int opcion;

    System.out.println("***********************************************************");
    System.out.println("*                                                         *");
    System.out.println("*        BIENVENIDO A LA CONSOLA DE LAS MCBURGUERS.       *");
    System.out.println("*                                                         *");
    System.out.println("***********************************************************\n");
		System.out.println("Por favor elige la opcion que deseas ejecutar.");

		do{
			System.out.println(
				"1.- Llamar.\n" +
				"2.- Caminar.\n" + 
				"3.- Ordenar.\n" + 
				"4.- Cocinar.\n" +
				"5.- Servir.\n" +
        "6.- Suspender.\n" +
        "7.- Autodestruir.\n" +
				"0.- Salir del restaurante.\n");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor elige una opcion VALIDA "
							+ "que deseas ejecutar.\n" + 
							"1.- Llamar.\n" +
              "2.- Caminar.\n" + 
              "3.- Ordenar.\n" + 
              "4.- Cocinar.\n" +
              "5.- Servir.\n" +
              "6.- Suspender.\n" +
              "7.- Autodestruir.\n" +
              "0.- Salir del restaurante.\n");
					}
				}

				switch(opcion){

					case 1:
						Patricio.llamar();
						break;

					case 2:
						Patricio.caminar();
						break;

					case 3:
						Patricio.ordenar();
						break;

					case 4:
						Patricio.cocinar();
						break;

					case 5:
						Patricio.servir();
						break;
          
          case 6:
						Patricio.suspender();
						break;
          
          case 7:
						Patricio.autodestruir();
						break;

					case 0:
            System.out.println("Saliendo del restaurante...");
						break;

					default:
						System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
						break;

				}

		}while(opcion != 0);

	}
}
