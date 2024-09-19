package programas;

import java.util.Scanner;

public class EjerciciosPracticos {

    public static void explicacionIfElseifElse() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************************");
        System.out.println("*                EJERCICIO                *");
        System.out.println("*******************************************");
        System.out.print("* Digite su edad:");
        int edad;
        edad = scanner.nextInt();
        if (edad >= 0 && edad <= 12) {
            System.out.println("* RESPUESTA: Es un niño ");
        } else if (edad >= 13 && edad <= 20) {
            System.out.println("* RESPUESTA: Es un jóven ");
        } else if (edad >= 21 && edad <= 60) {
            System.out.println("* RESPUESTA: Es un adulto ");
        } else {
            System.out.println("* RESPUESTA: Es de la tercera edad");
        }
    }

    public static void EjercicioSwitch() {
        Scanner scannerValidacionSwich = new Scanner(System.in);

        System.out.println("*******************************************");
        System.out.println("*            EJERCICIO SWITCH             *");
        System.out.println("*******************************************");
        System.out.print("* Digite su calificación:");

        int calificacion;
        calificacion = scannerValidacionSwich.nextInt();
        switch (calificacion) {
            case 1:
            case 2:
                System.out.println("* Su calificacion es F                    *");
                break;
            case 3:
            case 4:
                System.out.println("* Su calificación es: D                   *");
                break;
            case 5:
            case 6:
                System.out.println("* Su calificación es: C                   *");
                break;
            case 7:
            case 8:
                System.out.println("* Su calificación es: B                   *");
                break;
            case 9:
            case 10:
                System.out.println("* Su calificación es: A                   *");
                break;
            default:
                System.out.println("Número no válido, por favor verifique");
                break;
        }
    }

    public static void ejercicioTernaria() {
        Scanner scannerValidacionTernaria = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("*                  EJERCICIO                *");
        System.out.println("*********************************************");
        System.out.println("* Digite un numero y sepa si es par o impar *");
        System.out.print("* Numero: ");
        int numero = scannerValidacionTernaria.nextInt();
        String res = (numero % 2 == 0) ? "* Su numero es par" : "* Su numero es impar";
        System.out.println(res);
    }

    public static void ejercicioDoWhile() {
        Scanner scannerBucleDoWhile = new Scanner(System.in);

        System.out.println("**********************************************");
        System.out.println("*           EJERCICIO DO WHILE               *");
        System.out.println("************************************** *******");
        System.out.println("* Adivine el numero entre 1 y 10             *");
        System.out.print("* Numero: ");

        int secretNumber = (int) (Math.random() * 10 + 1);
        int numAdivina;

        do {
            numAdivina = scannerBucleDoWhile.nextInt();
            if (numAdivina < secretNumber) {
                System.out.println("Demasiado bajo, intenta nuevamente.");
            } else if (numAdivina > secretNumber) {
                System.out.println("Demasiado alto, intenta nuevamente.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        } while (numAdivina != secretNumber);
    }

    public static void ejercicioWhile() {
        Scanner scannerbuclewhile = new Scanner(System.in);

        System.out.println("***********************************************");
        System.out.println("*                   EJERCICIO                 *");
        System.out.println("***********************************************");
        System.out.println("* Digite un numero para realizar la sumatoria *");
        System.out.print("* Numero: ");
        int numero = scannerbuclewhile.nextInt();
        int sum1 = 0;
        int tot = 0;
        while (sum1 < numero) {
            sum1 = sum1 + 1;
            tot = tot + sum1;
        }
        System.out.println(tot);
    }

    public static void ejericioFor() {
        Scanner scannerBucleFor = new Scanner(System.in);

        System.out.println("***********************************************");
        System.out.println("*                   EJERCICIO                 *");
        System.out.println("***********************************************");
        System.out.println("* Digite un numero para realizar la sumatoria *");
        System.out.print("* Numero: ");
        int numero = scannerBucleFor.nextInt();
        int sum1 = 0;
        int tot = 0;
        for (int i = 0; i < numero; i++) {
            sum1 = sum1 + 1;
            tot = tot + sum1;
        }
        System.out.println(tot);
    }
}
