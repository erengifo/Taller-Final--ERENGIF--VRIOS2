package ejecucion;

import explicaciones.DetalleExplicacion;
import menus.MenuPrincipal;
import menus.SubMenus;
import menus.Titulo;
import programas.EjerciciosPracticos;
import utilidades.Validaciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean cerrar = false;
        Scanner scanner = new Scanner(System.in);
        Scanner scannerValidacionMenuPrincipal = new Scanner(System.in);


        int opc;
        Titulo.tituloPrincipal();

        do {
            //Nombre de la clase + el nombre del método
            MenuPrincipal.menuPrinicpal();
            Validaciones.opcionValida(scanner);
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    mostrarMenuDatosPrimitivos();
                    break;
                case 2:
                    mostrarOpcionesString();
                    break;
                case 3:
                    mostrarOpcionConstante();
                    break;
                case 4:
                    tiposDeOperadores();
                    break;
                case 5:
                    condicionalelseif();
                    break;
                case 6:
                    menuSwitch();
                    break;
                case 7:
                    ternaria();
                    break;
                case 8:
                    bucledowhile();
                    break;
                case 9:
                    buclewhile();
                    break;
                case 10:
                    buclefor();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción Invalida. Intente nuevamente.");
                    break;
            }
            break;
        } while (!cerrar);
    }

    public static void mostrarMenuDatosPrimitivos() {
        Scanner scannerDatosPrimitivos = new Scanner(System.in);
        boolean cerrar = false;
        int opcdp;

        do {
            SubMenus.datosPrimitivos();
            // Esta llamando la clase validaciones
            Validaciones.opcionValida(scannerDatosPrimitivos);

            opcdp = scannerDatosPrimitivos.nextInt();


            switch (opcdp) {
                case 1:
                    DetalleExplicacion.expliccionByte();
                    break;
                case 2:
                    DetalleExplicacion.explicacionShort();
                    break;
                case 3:
                    DetalleExplicacion.explicacionInt();
                    break;
                case 4:
                    DetalleExplicacion.explicacionLong();
                    break;
                case 5:
                    DetalleExplicacion.explicacionFloat();
                    break;
                case 6:
                    DetalleExplicacion.explicacionDouble();
                    break;
                case 7:
                    DetalleExplicacion.explicacionChar();
                    break;
                case 8:
                    DetalleExplicacion.explicacionBoolean();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
            //ESTE IF NO ESTA HACIENDO NADA
            if (opcdp == 9 || opcdp == 0) {
                break;
            }
            salida();
        } while (!cerrar);
    }

    private static void mostrarOpcionesString() {
        Scanner scannerOpcionesString = new Scanner(System.in);
        boolean cerrar = false;
        int opcStrin;

        do {
            SubMenus.tiposString();
            Validaciones.opcionValida(scannerOpcionesString);

            opcStrin = scannerOpcionesString.nextInt();
            // Esta llamando la clase validaciones
            Validaciones.opcionValida(scannerOpcionesString);
            opcStrin = scannerOpcionesString.nextInt();

            switch (opcStrin) {
                case 1:
                    DetalleExplicacion.explicacionString();
                    break;
                case 2:
                    DetalleExplicacion.explicacionStringBuilder();
                    break;
                case 3:
                    DetalleExplicacion.explicacionStringBuffer();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
            if (opcStrin == 4 || opcStrin == 0) {
                break;
            }
            salida();
        } while (!cerrar);
    }

    private static void mostrarOpcionConstante() {
        Scanner scannerOpcionConstantes = new Scanner(System.in);
        boolean cerrar = false;
        int opcConstantes;

        do {
            SubMenus.constantes();
            Validaciones.opcionValida(scannerOpcionConstantes);
            opcConstantes = scannerOpcionConstantes.nextInt();
            // Esta llamando la clase validaciones
            Validaciones.opcionValida(scannerOpcionConstantes);

            switch (opcConstantes) {
                case 1:
                    DetalleExplicacion.explicacionConstantes();
                    break;
                case 2:
                    DetalleExplicacion.ejemploConstantes();
                    break;
                case 3:
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
            if (opcConstantes == 3 || opcConstantes == 0) {
                break;
            }
            salida();
        } while (!cerrar);
    }

    private static void tiposDeOperadores() {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerValidacionMenuPrincipal = new Scanner(System.in);
        boolean cerrar = false;
        int opcTipoOperadores;

        do {
            SubMenus.tiposOperadores();
            // Esta llamando la clase validaciones
            Validaciones.opcionValida(scannerValidacionMenuPrincipal);
            opcTipoOperadores = scanner.nextInt();

            switch (opcTipoOperadores) {
                case 1:
                    DetalleExplicacion.explicacionOperadorArimetico();
                    break;
                case 2:
                    DetalleExplicacion.explicacionOperadorRacional();
                    break;
                case 3:
                    DetalleExplicacion.explicacionOperadorLogicos();
                    break;
                case 4:
                    DetalleExplicacion.explicacioOperadorAsignacion();
                    break;
                case 5:
                    DetalleExplicacion.explicacionOperadorIncrementoDecremento();
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
            if (opcTipoOperadores == 6 || opcTipoOperadores == 0) {
                break;
            }
            salida();
        } while (!cerrar);
    }

    private static void condicionalelseif() {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerValidacionMenuPrincipal = new Scanner(System.in);
        boolean cerrar = false;
        int opcCodicional;

        do {
            SubMenus.IfElseifElse();
            // Esta llamando la clase validaciones
            Validaciones.opcionValida(scannerValidacionMenuPrincipal);
            opcCodicional = scanner.nextInt();

            switch (opcCodicional) {
                case 1:
                    DetalleExplicacion.explicacioIf();
                    break;
                case 2:
                    DetalleExplicacion.explicacionElseIf();
                    break;
                case 3:
                    DetalleExplicacion.explicacionElse();
                    break;
                case 4:
                    EjerciciosPracticos.explicacionIfElseifElse();
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
            if (opcCodicional == 5 || opcCodicional == 0) {
                break;
            }
            salida();
        } while (!cerrar);
    }

    private static void menuSwitch() {
        Scanner scannerValidacionSwich = new Scanner(System.in);
        boolean cerrar = false;
        int opcCodicional;

        do {
            SubMenus.MenuSwitch();
            // Esta llamando la clase validaciones
            Validaciones.opcionValida(scannerValidacionSwich);

            opcCodicional = scannerValidacionSwich.nextInt();
            Validaciones.opcionValida(scannerValidacionSwich);


            switch (opcCodicional) {
                case 1:
                    DetalleExplicacion.explicacionSwitch();
                    break;
                case 2:
                    EjerciciosPracticos.EjercicioSwitch();
                default:
                    break;
            }
            if (opcCodicional == 3 || opcCodicional == 0) {
                break;
            }
            salida();
        } while (!cerrar);
    }

    private static void ternaria() {
        Scanner scannerValidacionTernaria = new Scanner(System.in);
        boolean cerrar = false;
        int opcCodicional;


        do {
            SubMenus.MenuTernarias();

            // Esta llamando la clase validaciones
            Validaciones.opcionValida(scannerValidacionTernaria);
            opcCodicional = scannerValidacionTernaria.nextInt();

            switch (opcCodicional) {
                case 1:
                    DetalleExplicacion.explicacionTernaria();
                    break;
                case 2:
                    EjerciciosPracticos.ejercicioTernaria();
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
            if (opcCodicional == 3 || opcCodicional == 0) {
                break;
            }
            salida();
        } while (!cerrar);
    }

    private static void bucledowhile() {
        Scanner scannerBucleDoWhile = new Scanner(System.in);
        boolean cerrar = false;
        int opcCodicional;

        do {
            SubMenus.MenuDoWhile();

            // Esta llamando la clase validaciones
            Validaciones.opcionValida(scannerBucleDoWhile);
            opcCodicional = scannerBucleDoWhile.nextInt();

            switch (opcCodicional) {
                case 1:
                    DetalleExplicacion.explicacionDoWhile();
                    break;
                case 2:
                    EjerciciosPracticos.ejercicioDoWhile();
                default:
                    break;
            }
            if (opcCodicional == 3 || opcCodicional == 0) {
                break;
            }
            salida();
        } while (!cerrar);
    }

    private static void buclewhile() {
        Scanner scannerbuclewhile = new Scanner(System.in);
        boolean cerrar = false;
        int opcCodicional;

        do {

            SubMenus.MenuWhile();

            // Esta llamando la clase validaciones
            Validaciones.opcionValida(scannerbuclewhile);
            opcCodicional = scannerbuclewhile.nextInt();

            switch (opcCodicional) {
                case 1:
                    DetalleExplicacion.explicacionWhile();
                    break;
                case 2:
                    EjerciciosPracticos.ejercicioWhile();
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
            if (opcCodicional == 3 || opcCodicional == 0) {
                break;
            }
            salida();
        } while (!cerrar);
    }

    private static void buclefor() {
        Scanner scannerBucleFor = new Scanner(System.in);
        boolean cerrar = false;
        int opcCodicional;

        do {
            SubMenus.MenuFor();
            // Esta llamando la clase validaciones
            Validaciones.opcionValida(scannerBucleFor);
            opcCodicional = scannerBucleFor.nextInt();

            switch (opcCodicional) {
                case 1:
                    DetalleExplicacion.explicacionFor();
                    break;
                case 2:
                    EjerciciosPracticos.ejericioFor();
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
            if (opcCodicional == 3 || opcCodicional == 0) {
                break;
            }
            salida();
        } while (!cerrar);
    }

    private static void salida() {
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

