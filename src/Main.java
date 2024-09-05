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
            System.out.println("********************************************");
            System.out.println("*        1. Datos Primitivos.              *");
            System.out.println("*        2. String.                        *");
            System.out.println("*        3. Constantes.                    *");
            System.out.println("*        4. Tipos de Operadores.           *");
            System.out.println("*        5. Condicional IF ELSE IF  ELSE   *");
            System.out.println("*        6. Condicional SWITCH.            *");
            System.out.println("*        7. Condicional TERNARIA.          *");
            System.out.println("*        8. Bucle DO WHILE.                *");
            System.out.println("*        9. Bucle WHILE.                   *");
            System.out.println("*        10.Bucle FOR.                     *");
            System.out.println("*        0. Salir.                         *");
            System.out.println("********************************************");
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
                    mostrarOpcionConstante(scanner);
                    break;
                case 4:
                    tiposDeOperadores(scanner);
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
        Scanner opcByte = new Scanner(System.in);
        Scanner opcShort = new Scanner(System.in);
        Scanner opcInt = new Scanner(System.in);
        Scanner opcLong = new Scanner(System.in);
        Scanner opcFloat = new Scanner(System.in);
        Scanner opcDouble = new Scanner(System.in);
        Scanner opcChar = new Scanner(System.in);
        Scanner opcBoolean = new Scanner(System.in);

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
                    System.out.println("*  1. Ver siguiente tipo de dato       *");
                    System.out.println("*  0. Salir.                           *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");

                    int numeroByte = opcByte.nextInt();
                    switch (numeroByte) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;


                    }

                case 2:
                    System.out.println("****************************************");
                    System.out.println("*                SHORT                 *");
                    System.out.println("* Este tipo de dato permite trabajar   *");
                    System.out.println("* con números enteros en el rango      *");
                    System.out.println("* –32,768 a 32,767                     *");
                    System.out.println("*                EJEMPLO               *");
                    System.out.println("*      short temperatura = -10         *");
                    System.out.println("****************************************");
                    System.out.println("*   1. Ver siguiente tipo de dato      *");
                    System.out.println("*   0. Salir                           *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");

                    int numeroShort = opcShort.nextInt();
                    switch (numeroShort) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

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
                    System.out.println("*  1. Ver siguiente tipo de dato       *");
                    System.out.println("*  0. Salir                            *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");

                    int itemInt = opcInt.nextInt();
                    switch (itemInt) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

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
                    System.out.println("*****************************************");
                    System.out.println("*  1. Ver siguiente tipo de dato        *");
                    System.out.println("*  0. Salir.                            *");
                    System.out.println("*****************************************");
                    System.out.print("Digite su opción: ");

                    int itemLong = opcLong.nextInt();
                    switch (itemLong) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

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
                    System.out.println("*   1. Ver siguiente tipo de dato      *");
                    System.out.println("*   0. Salir                           *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");

                    int itemFloat = opcFloat.nextInt();
                    switch (itemFloat) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

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
                    System.out.println("*    1. Ver siguiente tipo de dato     *");
                    System.out.println("*    0. Salir                          *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");
                    int itemDouble = opcDouble.nextInt();

                    switch (itemDouble) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

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
                    System.out.println("*   1. Ver siguiente tipo de dato       *");
                    System.out.println("*   0. Salir                            *");
                    System.out.println("*****************************************");
                    System.out.print("Digite su opción: ");
                    int itemChar = opcChar.nextInt();

                    switch (itemChar) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

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
                    System.out.println("*   1. Ver siguiente tipo de dato      *");
                    System.out.println("*   0. Salir                           *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");
                    int itemBoolean = opcBoolean.nextInt();

                    switch (itemBoolean) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        } while (!cerrar);

    }

    private static void mostrarOpcionesString(Scanner scanner) {
        Scanner opcString = new Scanner(System.in);
        Scanner opcStringBuilder = new Scanner(System.in);
        Scanner opcStringBuffer = new Scanner(System.in);

        boolean cerrar1 = false;
        int opcStrin;

        do {
            System.out.println("***************************************");
            System.out.println("*           Tipos de String           *");
            System.out.println("***************************************");
            System.out.println("*        1. String                    *");
            System.out.println("*        2. StringBuilder             *");
            System.out.println("*        3. StringBuffer              *");
            System.out.println("*        9. Volver al menú anterior   *");
            System.out.println("*        0. Salir                     *");
            System.out.println("***************************************");
            System.out.print("Digite su opción: ");
            opcStrin = scanner.nextInt();


            switch (opcStrin) {
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
                    System.out.println("*   1. Ver siguiente concepto          *");
                    System.out.println("*   0. Salir.                          *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");
                    int itemString = opcString.nextInt();

                    switch (itemString) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

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
                    System.out.println("*    1.Ver siguiente concepto             *");
                    System.out.println("*    0. Salir                             *");
                    System.out.println("*******************************************");
                    System.out.print("Digite su opción: ");
                    int itemStringBuilder = opcStringBuilder.nextInt();

                    switch (itemStringBuilder) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

                case 3:
                    System.out.println("*******************************************");
                    System.out.println("*           StringBuffer                  *");
                    System.out.println("*******************************************");
                    System.out.println("* Similar a StringBuilder, pero es        *");
                    System.out.println("* thread-safe, lo que significa que       *");
                    System.out.println("* a esta característica.                  *");
                    System.out.println("* puede ser usado en entornos donde       *");
                    System.out.println("* múltiples threads pueden acceder        *");
                    System.out.println("* al mismo objeto. Es un poco menos       *");
                    System.out.println("* eficiente que StringBuilder debido      *");
                    System.out.println("*                                         *");
                    System.out.println("*               EJEMPLO                   *");
                    System.out.println("* StringBuffer sbf = new StringBuffer();  *");
                    System.out.println("* sbf.append(\"Hola\");                   *");
                    System.out.println("* sbf.append(\" Mundo\");                 *");
                    System.out.println("* String resultado = sbf.toString();      *");
                    System.out.println("*                                         *");
                    System.out.println("*******************************************");
                    System.out.println("*              0. Salir                   *");
                    System.out.println("*******************************************");
                    System.out.print("Digite su opción: ");
                    int itemtringBuffer = opcStringBuffer.nextInt();

                    switch (itemtringBuffer) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        } while (!cerrar1);
    }


    private static void mostrarOpcionConstante(Scanner scanner) {
        Scanner opcConstante = new Scanner(System.in);
        Scanner opcEjmConstante = new Scanner(System.in);


        boolean cerrar2 = false;
        int opcConstantes;

        do {
            System.out.println("***************************************");
            System.out.println("*             CONSTANTES              *");
            System.out.println("***************************************");
            System.out.println("*         1. Significado              *");
            System.out.println("*         2. Ejemplo                  *");
            System.out.println("*         3. Volver al menú anterior  *");
            System.out.println("*         4. Salir                    *");
            System.out.println("***************************************");
            System.out.print("Digite su opción: ");
            opcConstantes = scanner.nextInt();

            switch (opcConstantes) {
                case 1:
                    System.out.println("****************************************");
                    System.out.println("*        ¿Qué son constantes?          *");
                    System.out.println("* En Java, una constante es un valor   *");
                    System.out.println("* que no cambia durante la ejecución   *");
                    System.out.println("* del programa. Las constantes se      *");
                    System.out.println("* utilizan pararepresentar valores     *");
                    System.out.println("* fijos y de lectura única             *");
                    System.out.println("****************************************");
                    System.out.println("*  1. Ver Ejemplo                      *");
                    System.out.println("*  0. Salir.                           *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");

                    int sigConstante = opcConstante.nextInt();
                    switch (sigConstante) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }
                    break;

                case 2:
                    System.out.println("****************************************");
                    System.out.println("*               EJEMPLO                *");
                    System.out.println("* public static final                  *");
                    System.out.println("* int TIEMPO_ESPERA_CONEXION = 30;     *");
                    System.out.println("****************************************");
                    System.out.println("* public static final                  *");
                    System.out.println("* boolean MODO_DEPURACION = true;      *");
                    System.out.println("****************************************");
                    System.out.println("*  0. Salir.                           *");
                    System.out.println("****************************************");
                    System.out.print("Digite su opción: ");

                    int ejmConstante = opcEjmConstante.nextInt();
                    switch (ejmConstante) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        }
        while (!cerrar2);


    }

    private static void tiposDeOperadores(Scanner scanner) {
        Scanner opcAritmetica = new Scanner(System.in);
        Scanner opcRelacionales = new Scanner(System.in);
        Scanner opcLogicos = new Scanner(System.in);
        Scanner opcAsignacion = new Scanner(System.in);
        Scanner opcIncDecr = new Scanner(System.in);

        boolean cerrar3 = false;
        int opcTipoOperadores;

        do {
            System.out.println("***************************************");
            System.out.println("*         Tipo de Operadores          *");
            System.out.println("***************************************");
            System.out.println("*         1. Aritméticos              *");
            System.out.println("*         2. Relacionales             *");
            System.out.println("*         3. Logicos                  *");
            System.out.println("*         4. Asignación               *");
            System.out.println("*         5. Incremento / Decremento  *");
            System.out.println("*         0. Salir.                   *");
            System.out.println("***************************************");
            System.out.print("Digite su opción: ");
            opcTipoOperadores = scanner.nextInt();

            switch (opcTipoOperadores) {
                case 1:
                    System.out.println("********************************************************************************************");
                    System.out.println("*                                     ARIMÉTICOS                                           *");
                    System.out.println("*                                                                                          *");
                    System.out.println("* + :Suma dos operadores /  int suma = 5+3;                                                *");
                    System.out.println("* - :Resta el segundo operando del primero / int resta = 5-3;                              *");
                    System.out.println("* * :Multiplica dos operadores / int multi = 5*3;                                          *");
                    System.out.println("* / :Divide el primer operando por el segundo / int div = 6/3;                             *");
                    System.out.println("* % :Devuelve el resto de la división del primer operando por el segundo / int div = 5%3;  *");
                    System.out.println("*                                                                                          *");
                    System.out.println("********************************************************************************************");
                    System.out.println("*              1. Ver siguiente Tipo de Operador                                           *");
                    System.out.println("*              0. Salir.                                                                   *");
                    System.out.println("********************************************************************************************");
                    System.out.print("Digite su opción: ");

                    int opAritmetico = opcAritmetica.nextInt();
                    switch (opAritmetico) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

                case 2:
                    System.out.println("****************************************************************************************************");
                    System.out.println("*                                        RELACIONALES                                              *");
                    System.out.println("*                                                                                                  *");
                    System.out.println("* == :Comprueba si los valores de dos operadores son iguales / boolean esIgual = (5==3);           *");
                    System.out.println("* != :Comprueba si los valores de dos operadores no son iguales / boolean noEsIgual = (5!=3)       *");
                    System.out.println("* > : Comprueba si el valor del primer operando es mayor que el segundo / boolean (5>3);           *");
                    System.out.println("* < : Comprueba si el valor del primer operando es menor que el segundo / boolean (5<3);           *");
                    System.out.println("* >=: Comprueba si el valor del primer operando es mayor o igual que el segundo / boolean (5>=3);  *");
                    System.out.println("* <=: Comprueba si el valor del primer operando es menor o igual que el segundo / boolean (5<=3);  *");
                    System.out.println("*                                                                                                  *");
                    System.out.println("****************************************************************************************************");
                    System.out.println("*                           1. Ver siguiente Tipo de Operador                                      *");
                    System.out.println("*                           0. Salir.                                                              *");
                    System.out.println("****************************************************************************************************");
                    System.out.print("Digite su opción: ");

                    int opRelacionales = opcRelacionales.nextInt();
                    switch (opRelacionales) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

                case 3:
                    System.out.println("*******************************************************************************************");
                    System.out.println("*                                        LOGICOS                                          *");
                    System.out.println("*                                                                                         *");
                    System.out.println("* && Devuelve true si ambos operandos son true / boolean resultado = (5>3 && 3<4);        *");
                    System.out.println("* || Devuelve true si al menso una de ellas es true / boolean resultado= (5>3 || 3<4);    *");
                    System.out.println("* ! Invierte el valor de un operando booleano /  boolean resultado = !(5>3);              *");
                    System.out.println("*                                                                                         *");
                    System.out.println("*******************************************************************************************");
                    System.out.println("*                           1. Ver siguiente Tipo de Operador                             *");
                    System.out.println("*                           0. Salir.                                                     *");
                    System.out.println("*******************************************************************************************");
                    System.out.print("Digite su opción: ");

                    int itemlogicos = opcLogicos.nextInt();
                    switch (itemlogicos) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

                case 4:
                    System.out.println("**********************************************************************************************************************");
                    System.out.println("*                                                   ASIGNACIÓN                                                       *");
                    System.out.println("*                                                                                                                    *");
                    System.out.println("* =  Asigna el valor del operando derecho al operando izquierdo / int a=5;                                           *");
                    System.out.println("* += Suma el operando derecho al operando izquierdo y asigna el resulatdo al operando izquierdo                      *");
                    System.out.println("*    int a=5;a+=3;                                                                                                   *");
                    System.out.println("* -= Resta el operando derecho al operando izquierdo y asigna el resulatdo al operando izquierdo                     *");
                    System.out.println("*    int a=5;a-=3;                                                                                                   *");
                    System.out.println("* *= Multiplica el operando derecho  por el operando izquierdoy asigna el resultado al operando izquierdo            *");
                    System.out.println("*    int a=5;a*=3;                                                                                                   *");
                    System.out.println("* /= Divide el operando izquierdo por el operando derecho y asigna el resultado al operando izquierdo                *");
                    System.out.println("*    int a=6;a/=3;                                                                                                   *");
                    System.out.println("* %= Calcula el módulo del operando izquierdo por el operando derecho y asigna el resultado del operando izquierdo   *");
                    System.out.println("*    int a=5;a%=3;                                                                                                   *");
                    System.out.println("*                                                                                                                    *");
                    System.out.println("**********************************************************************************************************************");
                    System.out.println("*                                   1. Ver siguiente Tipo de Operador                                                *");
                    System.out.println("*                                   0. Salir.                                                                        *");
                    System.out.println("**********************************************************************************************************************");
                    System.out.print("Digite su opción: ");

                    int itemAsihnacion = opcAsignacion.nextInt();
                    switch (itemAsihnacion) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

                case 5:
                    System.out.println("*******************************************************************************************");
                    System.out.println("*                               INCREMENTO / DECREMENTO                                   *");
                    System.out.println("*                                                                                         *");
                    System.out.println("* ++ Incrementa el valor del opernado en 1 /  int a= 5;++;                                *");
                    System.out.println("* -- Decrementa el valor del opernado en 1 /  int a= 5;++;                                *");
                    System.out.println("*                                                                                         *");
                    System.out.println("*******************************************************************************************");
                    System.out.println("*                                  0. Salir.                                              *");
                    System.out.println("*******************************************************************************************");
                    System.out.print("Digite su opción: ");

                    int itemIncDecr = opcIncDecr.nextInt();
                    switch (itemIncDecr) {
                        case 1:
                            break;
                        case 0:
                            System.exit(0);  // Salir del programa
                            break;
                    }

            }

            scanner.close();
        } while (!cerrar3);
    }
}
