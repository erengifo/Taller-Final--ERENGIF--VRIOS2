package utilidades;

import menus.SubMenus;

import java.util.Scanner;

public class Validaciones {

    public static void opcionValida(Scanner scannerMenu) {
        //hasNextInt recibe un entero, si el escanner recibe algo diferente a un entero muestre lo siguiente:
        while (!scannerMenu.hasNextInt()) {
            System.out.println("Por favor ingrese un número valido ");
            scannerMenu.next(); // Limpiar la entrada incorrecta
            System.out.println("Ingrese su opción");
        }

    }

    public static void salida() {
        Scanner scannerSalida = new Scanner(System.in);
        int opcsubmenu;
        SubMenus.opcionSalida();

        // Esta llamando la clase validaciones
        Validaciones.opcionValida(scannerSalida);
        opcsubmenu = scannerSalida.nextInt();
        switch (opcsubmenu) {
            case 1:
                break;
            case 0:
                System.exit(0);  // Salir del programa
                break;
            default:
                break;
        }
    }
}
