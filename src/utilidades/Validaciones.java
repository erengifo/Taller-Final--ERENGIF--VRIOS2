package utilidades;

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
}
