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
            System.out.println("*        5. Condicional IF, ELSE IF, ELSE  *");
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
                    cerrar = true;
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        } while (!cerrar);
    }

    public static void mostrarMenuDatosPrimitivos() {
        Scanner scanner = new Scanner(System.in);
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
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
            if (opcdp == 9 || opcdp == 0) {
                break;
            }
            salida();
        } while (!cerrar);
    }

    private static void mostrarOpcionesString() {
        Scanner scanner = new Scanner(System.in);
        boolean cerrar1 = false;
        int opcStrin;

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
                    break;
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
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
            if (opcStrin == 4 || opcStrin == 0) {
                break;
            }
            salida();
        } while (!cerrar1);
    }

    private static void mostrarOpcionConstante() {
        Scanner scanner = new Scanner(System.in);
        boolean cerrar = false;
        int opcConstantes;

        do {
            System.out.println("***************************************");
            System.out.println("*             CONSTANTES              *");
            System.out.println("***************************************");
            System.out.println("*         1. Explicación              *");
            System.out.println("*         2. Ejercicio*               *");
            System.out.println("*         3. Volver al menú anterior  *");
            System.out.println("*         0. Salir                    *");
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
        boolean cerrar = false;
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
            System.out.println("*         6. Volver al menu anterior  *");
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
                    break;
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
                    break;
                case 3:
                    System.out.println("*******************************************************************************************");
                    System.out.println("*                                        LOGICOS                                          *");
                    System.out.println("*                                                                                         *");
                    System.out.println("* && Devuelve true si ambos operandos son true / boolean resultado = (5>3 && 3<4);        *");
                    System.out.println("* || Devuelve true si al menso una de ellas es true / boolean resultado= (5>3 || 3<4);    *");
                    System.out.println("* ! Invierte el valor de un operando booleano /  boolean resultado = !(5>3);              *");
                    System.out.println("*                                                                                         *");
                    System.out.println("*******************************************************************************************");
                    break;
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
                    break;
                case 5:
                    System.out.println("************************************************************");
                    System.out.println("*                   INCREMENTO / DECREMENTO                *");
                    System.out.println("*                                                          *");
                    System.out.println("* ++ Incrementa el valor del opernado en 1 /  int a= 5;++; *");
                    System.out.println("* -- Decrementa el valor del opernado en 1 /  int a= 5;++; *");
                    System.out.println("*                                                          *");
                    System.out.println("************************************************************");
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
        boolean cerrar = false;
        int opcCodicional;

        do {
            System.out.println("***************************************");
            System.out.println("*          IF, ELSE IF Y ELSE         *");
            System.out.println("***************************************");
            System.out.println("*         1. IF                       *");
            System.out.println("*         2. ELSE IF                  *");
            System.out.println("*         3. ELSE                     *");
            System.out.println("*         4. Ejecicio                 *");
            System.out.println("*         5. Volver al menú anterior  *");
            System.out.println("*         0. Salir                    *");
            System.out.println("***************************************");
            System.out.print("Digite su opción: ");
            opcCodicional = scanner.nextInt();

            switch (opcCodicional) {
                case 1:
                    System.out.println("*******************************************");
                    System.out.println("*                     IF                  *");
                    System.out.println("* La sentencia IF,se ejecuta cuando una   *");
                    System.out.println("* condicion especificada es evaluada como *");
                    System.out.println("* verdadera.                              *");
                    System.out.println("*                 EJEMPLO                 *");
                    System.out.println("*            if (5 > 1 ) {                *");
                    System.out.println("*               /* Se ejecuta */          *");
                    System.out.println("*            }                            *");
                    System.out.println("*                                         *");
                    System.out.println("*******************************************");
                    break;
                case 2:
                    System.out.println("********************************************");
                    System.out.println("*                  ELSE IF                 *");
                    System.out.println("* Esta sentencia puede ser usada cuando se *");
                    System.out.println("* requiere anidar multiples sentencias     *");
                    System.out.println("*                                          *");
                    System.out.println("*                  EJEMPLO                 *");
                    System.out.println("*             if (x > 50) {                *");
                    System.out.println("*                    /* hace algo */       *");
                    System.out.println("*             } else if (x > 5) {          *");
                    System.out.println("*                    /* Se ejecuta */      *");
                    System.out.println("*             } else {                     *");
                    System.out.println("*                    /* hace algo */       *");
                    System.out.println("*             }                            *");
                    System.out.println("*                                          *");
                    System.out.println("********************************************");
                    break;
                case 3:
                    System.out.println("*******************************************");
                    System.out.println("*                   ELSE                  *");
                    System.out.println("* La sentencia ELSE,se ejecuta cuando una *");
                    System.out.println("* condicion especificada es evaluada como *");
                    System.out.println("* falsa.                                  *");
                    System.out.println("*                 EJEMPLO                 *");
                    System.out.println("*              if (5 > 10 ) {             *");
                    System.out.println("*                   /* hace algo */       *");
                    System.out.println("*              } else {                   *");
                    System.out.println("*                   /* Se ejecuta */      *");
                    System.out.println("*              }                          *");
                    System.out.println("*                                         *");
                    System.out.println("*******************************************");
                    break;
                case 4:
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
        Scanner scanner = new Scanner(System.in);
        boolean cerrar = false;
        int opcCodicional;

        do {
            System.out.println("***********************************");
            System.out.println("*               SWITCH            *");
            System.out.println("***********************************");
            System.out.println("*     1. Explicación              *");
            System.out.println("*     2. Ejercicio                *");
            System.out.println("*     3. Volver al menú anterior  *");
            System.out.println("*     0. Salir                    *");
            System.out.println("***********************************");
            System.out.print("Digite su opción: ");
            opcCodicional = scanner.nextInt();

            switch (opcCodicional) {
                case 1:
                    System.out.println("**********************************************");
                    System.out.println("*                    SWITCH                  *");
                    System.out.println("* Estructura que evalúa una expresión frente *");
                    System.out.println("* a múltiples casos posibles y ejecutará uno *");
                    System.out.println("* o más bloques de código en función de los  *");
                    System.out.println("* casos coincidentes.                        *");
                    System.out.println("*                                            *");
                    System.out.println("*                   EJEMPLO                  *");
                    System.out.println("*    switch (expresión) {                    *");
                    System.out.println("*      case x:                               *");
                    System.out.println("*      // ejecuta el codigo para el caso x   *");
                    System.out.println("*      break;                                *");
                    System.out.println("*      case y:                               *");
                    System.out.println("*      // ejecuta el codigo para el caso y   *");
                    System.out.println("*      break;                                *");
                    System.out.println("*      default:                              *");
                    System.out.println("*      // ejecución en cualquier otro caso   *");
                    System.out.println("*    }                                       *");
                    System.out.println("*                                            *");
                    System.out.println("**********************************************");
                    break;
                case 2:
                    System.out.println("*******************************************");
                    System.out.println("*                EJERCICIO                *");
                    System.out.println("*******************************************");
                    System.out.print("* Digite su calificación:");

                    int calificacion;
                    calificacion = scanner.nextInt();
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
        Scanner scanner = new Scanner(System.in);
        boolean cerrar = false;
        int opcCodicional;

        do {
            System.out.println("***********************************");
            System.out.println("*             TERNARIA            *");
            System.out.println("***********************************");
            System.out.println("*     1. Explicación              *");
            System.out.println("*     2. Ejercicio                *");
            System.out.println("*     3. Volver al menú anterior  *");
            System.out.println("*     0. Salir                    *");
            System.out.println("***********************************");
            System.out.print("Digite su opción: ");
            opcCodicional = scanner.nextInt();

            switch (opcCodicional) {
                case 1:
                    System.out.println("*****************************************");
                    System.out.println("*                TERNARIA               *");
                    System.out.println("* Es una forma concisa de escribir una  *");
                    System.out.println("* declaracion if-else en una sola línea *");
                    System.out.println("*                                       *");
                    System.out.println("*****************************************");
                    break;
                case 2:
                    System.out.println("*********************************************");
                    System.out.println("*                  EJERCICIO                *");
                    System.out.println("*********************************************");
                    System.out.println("* Digite un numero y sepa si es par o impar *");
                    System.out.print("* Numero: ");
                    int numero = scanner.nextInt();
                    String res = (numero % 2 == 0) ? "* Su numero es par" : "* Su numero es impar";
                    System.out.println(res);
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
        Scanner scanner = new Scanner(System.in);
        boolean cerrar = false;
        int opcCodicional;

        do {
            System.out.println("***********************************");
            System.out.println("*             DO WHILE            *");
            System.out.println("***********************************");
            System.out.println("*     1. Explicación              *");
            System.out.println("*     2. Ejercicio                *");
            System.out.println("*     3. Volver al menú anterior  *");
            System.out.println("*     0. Salir                    *");
            System.out.println("***********************************");
            System.out.print("Digite su opción: ");
            opcCodicional = scanner.nextInt();

            switch (opcCodicional) {
                case 1:
                    System.out.println("*******************************************");
                    System.out.println("*                  DO WHILE               *");
                    System.out.println("* Crea un bucle que ejecuta una sentencia *");
                    System.out.println("* especificada, hasta que la condición de *");
                    System.out.println("* comprobación se evalúa como falsa.      *");
                    System.out.println("*                                         *");
                    System.out.println("* La condición se evalúa después de la    *");
                    System.out.println("* ejecución de la sentecia, dando como    *");
                    System.out.println("* resultado, que la ejecución se realice  *");
                    System.out.println("* al menos una vez.                       *");
                    System.out.println("*******************************************");
                    break;
                case 2:
                    System.out.println("*********************************************");
                    System.out.println("*                  EJERCICIO                *");
                    System.out.println("*********************************************");
                    System.out.println("* Adivine el numero entre 1 y 10            *");
                    System.out.print("* Numero: ");

                    int secretNumber = (int) (Math.random() * 10 + 1);
                    int numAdivina;

                    do {
                        numAdivina = scanner.nextInt();
                        if (numAdivina < secretNumber) {
                            System.out.println("Demasiado bajo, intenta nuevamente.");
                        } else if (numAdivina > secretNumber) {
                            System.out.println("Demasiado alto, intenta nuevamente.");
                        } else {
                            System.out.println("¡Felicidades! Has adivinado el número.");
                        }
                    } while (numAdivina != secretNumber);
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
        Scanner scanner = new Scanner(System.in);
        boolean cerrar = false;
        int opcCodicional;

        do {
            System.out.println("***********************************");
            System.out.println("*              WHILE              *");
            System.out.println("***********************************");
            System.out.println("*     1. Explicación              *");
            System.out.println("*     2. Ejercicio                *");
            System.out.println("*     3. Volver al menú anterior  *");
            System.out.println("*     0. Salir                    *");
            System.out.println("***********************************");
            System.out.print("Digite su opción: ");
            opcCodicional = scanner.nextInt();

            switch (opcCodicional) {
                case 1:
                    System.out.println("********************************************");
                    System.out.println("*                     WHILE                *");
                    System.out.println("* Permite repetir una accion en un bucle   *");
                    System.out.println("* siempre y cuando se cumpla una condicion *");
                    System.out.println("* booleana de control.                     *");
                    System.out.println("*                                          *");
                    System.out.println("********************************************");
                    break;
                case 2:
                    System.out.println("***********************************************");
                    System.out.println("*                   EJERCICIO                 *");
                    System.out.println("***********************************************");
                    System.out.println("* Digite un numero para realizar la sumatoria *");
                    System.out.print("* Numero: ");
                    int numero = scanner.nextInt();
                    int sum1 = 0;
                    int tot = 0;
                    while (sum1 < numero) {
                        sum1 = sum1 + 1;
                        tot = tot + sum1;
                    }
                    System.out.println(tot);
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

    private static void buclefor() {
        Scanner scanner = new Scanner(System.in);
        boolean cerrar = false;
        int opcCodicional;

        do {
            System.out.println("***********************************");
            System.out.println("*               FOR               *");
            System.out.println("***********************************");
            System.out.println("*     1. Explicación              *");
            System.out.println("*     2. Ejercicio                *");
            System.out.println("*     3. Volver al menú anterior  *");
            System.out.println("*     0. Salir                    *");
            System.out.println("***********************************");
            System.out.print("Digite su opción: ");
            opcCodicional = scanner.nextInt();

            switch (opcCodicional) {
                case 1:
                    System.out.println("**********************************************");
                    System.out.println("*                       FOR                  *");
                    System.out.println("* Permite realizar una accion en un bucle    *");
                    System.out.println("* hasta que se cumpla una condicion definida *");
                    System.out.println("* booleana de control.                       *");
                    System.out.println("*                                            *");
                    System.out.println("**********************************************");
                    break;
                case 2:
                    System.out.println("***********************************************");
                    System.out.println("*                   EJERCICIO                 *");
                    System.out.println("***********************************************");
                    System.out.println("* Digite un numero para realizar la sumatoria *");
                    System.out.print("* Numero: ");
                    int numero = scanner.nextInt();
                    int sum1 = 0;
                    int tot = 0;
                    for (int i = 0; i < numero; i++) {
                        sum1 = sum1 + 1;
                        tot = tot + sum1;
                    }
                    System.out.println(tot);
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
        Scanner scanner = new Scanner(System.in);
        int opcsubmenu;
        System.out.println("*********************************");
        System.out.println("*  1. Volver al menu anterior   *");
        System.out.println("*  0. Salir.                    *");
        System.out.println("*********************************");
        System.out.print("Digite su opción: ");
        opcsubmenu = scanner.nextInt();
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

