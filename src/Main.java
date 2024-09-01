import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cerrar = false;
        int opc;

        System.out.println("***************************************");
        System.out.println("*        CAPÍTULO PROGRAMACIÓN        *");
        System.out.println("*          ERIKA Y VALENTINA          *");
        System.out.println("***************************************");

        do {
            System.out.println("***************************************");
            System.out.println("*        1. Datos Primitivos.         *");
            System.out.println("*        2. String.                   *");
            System.out.println("*        3. Constantes.               *");
            System.out.println("*        4. Tipos de Operadores.      *");
            System.out.println("*        5. Condicional IF ELSE.      *");
            System.out.println("*        6. Condicional SWITCH.       *");
            System.out.println("*        7. Condicional TERNARIA.     *");
            System.out.println("*        8. Bucle DO WHILE.           *");
            System.out.println("*        9. Bucle WHILE.              *");
            System.out.println("*        10. Bucle FOR.               *");
            System.out.println("*        0. Salir.                    *");
            System.out.println("***************************************");
            System.out.print("Digite su opción: ");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    mostrarMenuDatosPrimitivos(scanner);
                    break;
                case 2:
                    mostrarOpcionesString(scanner);
                    break;
                case 3:
                    mostrarOpcionesConstantes(scanner);
                    break;
                case 4:
                    System.out.println("crea menú Tipos de Operadores");
                    break;
                case 5:
                    System.out.println("crea menú Condicional IF ELSE");
                    break;
                case 6:
                    System.out.println("crea menú Condicional SWITCH");
                    break;
                case 7:
                    System.out.println("crea menú Condicional TERNARIA");
                    break;
                case 8:
                    System.out.println("crea menú Bucle DO WHILE");
                    break;
                case 9:
                    System.out.println("crea menú Bucle WHILE");
                    break;
                case 10:
                    System.out.println("crea menú Bucle FOR");
                    break;
                case 0:
                    cerrar = true;
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        } while (!cerrar);

        scanner.close();
    }


    public static void mostrarMenuDatosPrimitivos(Scanner scanner) {
        boolean cerrar = false;
        int opcdp;

        do {
            System.out.println("***************************************");
            System.out.println("*          Datos Primitivos           *");
            System.out.println("***************************************");
            System.out.println("*         1. Explicación byte.        *");
            System.out.println("*         2. Explicación short        *");
            System.out.println("*         3. Explicación int          *");
            System.out.println("*         4. Explicación long         *");
            System.out.println("*         5. Explicación float        *");
            System.out.println("*         6. Explicación double       *");
            System.out.println("*         7. Explicación char         *");
            System.out.println("*         8. Explicación boolean      *");
            System.out.println("*         9. Volver al menú anterior  *");
            System.out.println("*         0. Salir.                   *");
            System.out.println("***************************************");
            System.out.print("Digite su opción: ");
            opcdp = scanner.nextInt();

            switch (opcdp) {
                case 1:
                    System.out.println("****************************************");
                    System.out.println("*                  BYTE                *");
                    System.out.println("* Representa un tipo de dato de 8 bits *");
                    System.out.println("* Puede almacenar valores numéricos en *");
                    System.out.println("* el rango de -128 a 127               *");
                    System.out.println("*                EJEMPLO               *");
                    System.out.println("*         byte diasMes = 31;           *");
                    System.out.println("****************************************");
                    System.out.println("*         1. Volver al menú anterior   *");
                    System.out.println("*         0. Salir.                    *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");
                    break;
                case 2:
                    System.out.println("****************************************");
                    System.out.println("*                SHORT                 *");
                    System.out.println("* Este tipo de dato permite trabajar   *");
                    System.out.println("* con números enteros en el rango      *");
                    System.out.println("* –32,768 a 32,767                     *");
                    System.out.println("*                EJEMPLO               *");
                    System.out.println("*      short temperatura = -10         *");
                    System.out.println("****************************************");
                    System.out.println("*         1. Volver al menú anterior   *");
                    System.out.println("*         0. Salir.                    *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");
                    break;

                case 3:

                    System.out.println("****************************************");
                    System.out.println("*                  INT                 *");
                    System.out.println("****************************************");
                    System.out.println("*Representa una cantidad finita de     *");
                    System.out.println("*números enteros, puede contener hasta *");
                    System.out.println("*tres cifras.                          *");
                    System.out.println("*                                      *");
                    System.out.println("*                EJEMPLO               *");
                    System.out.println("*             int edad=101             *");
                    System.out.println("*                                      *");
                    System.out.println("****************************************");
                    System.out.println("*         1. Volver al menú anterior   *");
                    System.out.println("*         0. Salir.                    *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");
                    break;

                case 4:
                    System.out.println("*****************************************");
                    System.out.println("*                 LONG                  *");
                    System.out.println("*****************************************");
                    System.out.println("* Se utiliza cuando se necesitan números*");
                    System.out.println("* enteros muy grandes o cuando los      *");
                    System.out.println("* números tienen un valor decimal       *");
                    System.out.println("*                                       *");
                    System.out.println("*               EJEMPLO                 *");
                    System.out.println("*   Long velocidadLuz =  299792458,36   *");
                    System.out.println("*                                       *");
                    System.out.println("*         1. Volver al menú anterior    *");
                    System.out.println("*         0. Salir.                     *");
                    System.out.println("*****************************************");
                    break;

                case 5:
                    System.out.println("****************************************");
                    System.out.println("*                 FLOAT                *");
                    System.out.println("****************************************");
                    System.out.println("* Este tipo de dato nos permiten       *");
                    System.out.println("* trabajar con números los cuales      *");
                    System.out.println("* posean punto decimal ya sean         *");
                    System.out.println("* positivos o negativos.               *");
                    System.out.println("* utiliza 32 bits                      *");
                    System.out.println("*                                      *");
                    System.out.println("*               EJEMPLO                *");
                    System.out.println("*        float pi = 3.1415926535       *");
                    System.out.println("*                                      *");
                    System.out.println("****************************************");
                    System.out.println("*         1. Volver al menú anterior   *");
                    System.out.println("*         0. Salir.                    *");
                    System.out.println("****************************************");
                    break;

                case 6:
                    System.out.println("****************************************");
                    System.out.println("*                 DOUBLE               *");
                    System.out.println("****************************************");
                    System.out.println("* Almacena números en coma flotante    *");
                    System.out.println("* con doble precisión de 64 bits,      *");
                    System.out.println("* lo que proporciona una mayor         *");
                    System.out.println("* precisión que float.                 *");
                    System.out.println("*                                      *");
                    System.out.println("*              EJEMPLO                 *");
                    System.out.println("*  double e = 2.718281828459045235360; *");
                    System.out.println("*                                      *");
                    System.out.println("****************************************");
                    System.out.println("*         1. Volver al menú anterior   *");
                    System.out.println("*         0. Salir.                    *");
                    System.out.println("****************************************");
                    break;

                case 7:
                    System.out.println("*****************************************");
                    System.out.println("*                  CHAR                 *");
                    System.out.println("*****************************************");
                    System.out.println("* Este tipo de dato nos permite         *");
                    System.out.println("* trabajar con caracteres alfanuméricos *");
                    System.out.println("* almacena hasta 16 bits                *");
                    System.out.println("*                                       *");
                    System.out.println("*             EJEMPLO                   *");
                    System.out.println("*         char letraA = 'a';            *");
                    System.out.println("*      char letraANumerico = 61;        *");
                    System.out.println("*                                       *");
                    System.out.println("*****************************************");
                    System.out.println("*         1. Volver al menú anterior    *");
                    System.out.println("*         0. Salir.                     *");
                    System.out.println("*****************************************");
                    break;

                case 8:
                    System.out.println("****************************************");
                    System.out.println("*                BOOLEAN               *");
                    System.out.println("****************************************");
                    System.out.println("* Este tipo de datos nos permitirá     *");
                    System.out.println("* trabajar con valores lógicos,        *");
                    System.out.println("* verdadero o falso.                   *");
                    System.out.println("*                                      *");
                    System.out.println("*               EJEMPLO                *");
                    System.out.println("*       boolean verdadero = true;      *");
                    System.out.println("*       boolean falso = false;         *");
                    System.out.println("*                                      *");
                    System.out.println("****************************************");
                    System.out.println("*         1. Volver al menú anterior   *");
                    System.out.println("*         0. Salir.                    *");
                    System.out.println("****************************************");
                    break;

                case 9:
                    cerrar = true;  // Regresa al menú principal
                    break;
                case 10:
                    System.exit(0);  // Salir del programa
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        } while (!cerrar);

    }

    public static void mostrarOpcionesString(Scanner scanner) {
        boolean cerrar = false;
        int opcString;

        do {
            System.out.println("***************************************");
            System.out.println("*           Tipos de String           *");
            System.out.println("***************************************");
            System.out.println("*        1. String                    *");
            System.out.println("*        2. StringBuilder             *");
            System.out.println("*        3. StringBuffer              *");
            System.out.println("*        4. Volver al menú anterior   *");
            System.out.println("*        0. Salir                     *");
            System.out.println("***************************************");
            System.out.print("Digite su opción: ");
            opcString = scanner.nextInt();

            switch (opcString) {
                case 1:
                    System.out.println("****************************************");
                    System.out.println("*               String                 *");
                    System.out.println("****************************************");
                    System.out.println("* Es una clase inmutable, lo que       *");
                    System.out.println("* significa que una vez creado un      *");
                    System.out.println("* objeto String, no puede modificarse. *");
                    System.out.println("* Cada modificación genera un nuevo    *");
                    System.out.println("* objeto String.                       *");
                    System.out.println("*                                      *");
                    System.out.println("*               EJEMPLO                *");
                    System.out.println("*   String saludo = \"Hola\";          *");
                    System.out.println("*   saludo = saludo + \" Mundo\";      *");
                    System.out.println("*                                      *");
                    System.out.println("****************************************");
                    System.out.println("*         1. Volver al menú anterior   *");
                    System.out.println("*         0. Salir.                    *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");
                    break;

                case 2:
                    System.out.println("*******************************************");
                    System.out.println("*           StringBuilder                 *");
                    System.out.println("*******************************************");
                    System.out.println("* Es una clase mutable que permite        *");
                    System.out.println("* modificar el contenido sin crear        *");
                    System.out.println("* nuevos objetos. Es más eficiente        *");
                    System.out.println("* para operaciones repetitivas de         *");
                    System.out.println("* concatenación. No es thread-safe.       *");
                    System.out.println("*                                         *");
                    System.out.println("*               EJEMPLO                   *");
                    System.out.println("* StringBuilder sb = new StringBuilder(); *");
                    System.out.println("* sb.append(\"Hola\");                    *");
                    System.out.println("* sb.append(\" Mundo\");                  *");
                    System.out.println("* String resultado = sb.toString();       *");
                    System.out.println("*                                         *");
                    System.out.println("*******************************************");
                    System.out.println("*         1. Volver al menú anterior      *");
                    System.out.println("*         0. Salir.                       *");
                    System.out.println("*******************************************");
                    System.out.print("Digite su opción: ");
                    break;

                case 3:
                    System.out.println("******************************************");
                    System.out.println("*           StringBuffer                 *");
                    System.out.println("******************************************");
                    System.out.println("* Similar a StringBuilder, pero es       *");
                    System.out.println("* thread-safe, lo que significa que      *");
                    System.out.println("* puede ser usado en entornos donde      *");
                    System.out.println("* múltiples threads pueden acceder       *");
                    System.out.println("* al mismo objeto. Es un poco menos      *");
                    System.out.println("* eficiente que StringBuilder debido     *");
                    System.out.println("* a esta característica.                 *");
                    System.out.println("*                                        *");
                    System.out.println("*               EJEMPLO                  *");
                    System.out.println("* StringBuffer sbf = new StringBuffer(); *");
                    System.out.println("* sbf.append(\"Hola\");                  *");
                    System.out.println("* sbf.append(\" Mundo\");                *");
                    System.out.println("* String resultado = sbf.toString();     *");
                    System.out.println("*                                        *");
                    System.out.println("******************************************");
                    System.out.println("*         1. Volver al menú anterior     *");
                    System.out.println("*         0. Salir.                      *");
                    System.out.println("******************************************");
                    System.out.print("Digite su opción: ");
                    break;

                case 4:
                    cerrar = true;  // Regresa al menú principal
                    break;
                case 5:
                    System.exit(0);  // Salir del programa
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        } while (!cerrar);
    }

    private static void mostrarOpcionesConstantes(Scanner scanner) {
        boolean cerrar = false;
        int opcConstantes;

        do {
            System.out.println("**********************************************");
            System.out.println("*                  Constantes                *");
            System.out.println("**********************************************");
            System.out.println("*   1. ¿Qué es?                              *");
            System.out.println("*   2. ¿Cómo se declaran?                    *");
            System.out.println("*   3. ¿Pára que se utilizan las constantes? *");
            System.out.println("*   4. Volver al menú anterior               *");
            System.out.println("*   0. Salir                                 *");
            System.out.println("**********************************************");
            System.out.print("Digite su opción: ");
            opcConstantes = scanner.nextInt();


            switch (opcConstantes) {
                case 1:
                    System.out.println("*****************************************");
                    System.out.println("*        ¿Qué es una constante?         *");
                    System.out.println("*****************************************");
                    System.out.println("* Tambien llamadas variables finales    *");
                    System.out.println("* son contenedores de datos como las    *");
                    System.out.println("* variables con la diferencia de que su *");
                    System.out.println("* valor solo puede ser inicializado. No *");
                    System.out.println("* Se les puede asignar un valor despues *");
                    System.out.println("* de inicializarlas.                    *");
                    System.out.println("* SU VALOR SIEMPRE ES EL MISMO          *");
                    System.out.println("*                                       *");
                    System.out.println("*****************************************");
                    System.out.println("*         1. Volver al menú anterior    *");
                    System.out.println("*         0. Salir.                     *");
                    System.out.println("*****************************************");
                    System.out.print("Digite su opción: ");
                    break;

                case 2:
                    System.out.println("******************************************");
                    System.out.println("*    ¿Cómo se declara una constante?     *");
                    System.out.println("******************************************");
                    System.out.println("* Variable inicializada                  *");
                    System.out.println("* final double PI = 3.14;                *");
                    System.out.println("*                                        *");
                    System.out.println("* Variable NO inicializada               *");
                    System.out.println("* final double PI;                       *");
                    System.out.println("* PI = 3.14;                             *");
                    System.out.println("*                                        *");
                    System.out.println("******************************************");
                    System.out.println("*         1. Volver al menú anterior     *");
                    System.out.println("*         0. Salir.                      *");
                    System.out.println("******************************************");
                    System.out.print("Digite su opción: ");
                    break;

                case 3:
                    System.out.println("********************************************");
                    System.out.println("*   ¿Pára que se utilizan las constantes?  *");
                    System.out.println("********************************************");
                    System.out.println("* Variable inicializada                    *");
                    System.out.println("* final double PI = 3.14;                  *");
                    System.out.println("*                                          *");
                    System.out.println("* Variable NO inicializada                 *");
                    System.out.println("* final double PI;                         *");
                    System.out.println("* PI = 3.14;                               *");
                    System.out.println("*                                          *");
                    System.out.println("********************************************");
                    System.out.println("*         1. Volver al menú anterior       *");
                    System.out.println("*         0. Salir.                        *");
                    System.out.println("********************************************");
                    System.out.print("Digite su opción: ");
                    break;


                case 4:
                    cerrar = true;  // Regresa al menú principal
                    break;
                case 0:
                    System.exit(0);  // Salir del programa
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        } while (!cerrar);
    }


}






