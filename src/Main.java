import java.util.Scanner;
import java.util.Iterator;
import State.Robot;
import Template.*;
import Iterator.*;
public class Main {
  public static void main(String[] args){
    Menu menu = new Menu("Menu de McBurguers", "Bienvenido al menu de McBurguers, dentro del restaurante tenemos las siguientes opciones");
    menu.add(new MenuGeneral());
    MenuEspecial menuEspecial = new MenuEspecial();
    menuEspecial.add(new HamburguesaHumano());
    menuEspecial.add(new Cangreburger());
    menuEspecial.add(new KrustyBurger());
    menu.add(menuEspecial);
    MenuDelDia menuDelDia = new MenuDelDia();
    menuDelDia.add(new HamburguesaPescado());
    menuDelDia.add(new UltiMeatum());
    menuDelDia.add(new HamburguesaLenteja());
    menu.add(menuDelDia);
		Robot Patricio = new Robot(menu.crearIterador());
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
