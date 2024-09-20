package explicaciones;

import java.security.PublicKey;

public class DetalleExplicacion {
    public static void expliccionByte() {
        System.out.println("****************************************");
        System.out.println("*                  BYTE                *");
        System.out.println("* Representa un tipo de dato de 8 bits *");
        System.out.println("* Puede almacenar valores numéricos en *");
        System.out.println("* el rango de -128 a 127               *");
        System.out.println("*                EJEMPLO               *");
        System.out.println("*         byte diasMes = 31;           *");
        System.out.println("****************************************");
    }

    public static void explicacionShort() {
        System.out.println("****************************************");
        System.out.println("*                SHORT                 *");
        System.out.println("* Este tipo de dato permite trabajar   *");
        System.out.println("* con números enteros en el rango      *");
        System.out.println("* –32,768 a 32,767                     *");
        System.out.println("*                EJEMPLO               *");
        System.out.println("*      short temperatura = -10         *");
        System.out.println("****************************************");
    }

    public static void explicacionInt() {
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
    }

    public static void
    explicacionLong() {
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
    }

    public static void explicacionFloat() {
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
    }

    public static void explicacionDouble() {
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
    }

    public static void explicacionChar() {
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
    }

    public static void explicacionBoolean() {
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
    }

    public static void explicacionString() {
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
    }

    public static void explicacionStringBuilder() {
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
    }

    public static void explicacionStringBuffer() {
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
    }

    public static void explicacionConstantes() {
        System.out.println("****************************************");
        System.out.println("*        ¿Qué son constantes?          *");
        System.out.println("* En Java, una constante es un valor   *");
        System.out.println("* que no cambia durante la ejecución   *");
        System.out.println("* del programa. Las constantes se      *");
        System.out.println("* utilizan pararepresentar valores     *");
        System.out.println("* fijos y de lectura única             *");
        System.out.println("****************************************");
    }

    public static void explicacionOperadorArimetico() {
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
    }

    public static void explicacionOperadorRacional() {
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
    }

    public static void explicacionOperadorLogicos() {
        System.out.println("*******************************************************************************************");
        System.out.println("*                                        LOGICOS                                          *");
        System.out.println("*                                                                                         *");
        System.out.println("* && Devuelve true si ambos operandos son true / boolean resultado = (5>3 && 3<4);        *");
        System.out.println("* || Devuelve true si al menso una de ellas es true / boolean resultado= (5>3 || 3<4);    *");
        System.out.println("* ! Invierte el valor de un operando booleano /  boolean resultado = !(5>3);              *");
        System.out.println("*                                                                                         *");
        System.out.println("*******************************************************************************************");
    }

    public static void explicacioOperadorAsignacion() {
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
    }

    public static void explicacionOperadorIncrementoDecremento() {
        System.out.println("************************************************************");
        System.out.println("*                   INCREMENTO / DECREMENTO                *");
        System.out.println("*                                                          *");
        System.out.println("* ++ Incrementa el valor del opernado en 1 /  int a= 5;++; *");
        System.out.println("* -- Decrementa el valor del opernado en 1 /  int a= 5;++; *");
        System.out.println("*                                                          *");
        System.out.println("************************************************************");
    }

    public static void explicacioIf() {
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
    }

    public static void ejemploConstantes() {
        System.out.println("****************************************");
        System.out.println("*          EJEMPLO CONSTANTES          *");
        System.out.println("* public static final                  *");
        System.out.println("* int TIEMPO_ESPERA_CONEXION = 30;     *");
        System.out.println("*                                      *");
        System.out.println("* public static final                  *");
        System.out.println("* boolean MODO_DEPURACION = true;      *");
        System.out.println("*                                      *");
        System.out.println("****************************************");
    }

    public static void explicacionElseIf() {
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
    }

    public static void explicacionElse() {
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
    }

    public static void explicacionSwitch() {
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
    }

    public static void explicacionTernaria() {
        System.out.println("*****************************************");
        System.out.println("*                TERNARIA               *");
        System.out.println("* Es una forma concisa de escribir una  *");
        System.out.println("* declaracion if-else en una sola línea *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");
    }

    public static void explicacionDoWhile() {
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
    }

    public static void explicacionWhile() {
        System.out.println("********************************************");
        System.out.println("*                     WHILE                *");
        System.out.println("* Permite repetir una accion en un bucle   *");
        System.out.println("* siempre y cuando se cumpla una condicion *");
        System.out.println("* booleana de control.                     *");
        System.out.println("*                                          *");
        System.out.println("********************************************");
    }

    public static void
    explicacionFor() {
        System.out.println("**********************************************");
        System.out.println("*                       FOR                  *");
        System.out.println("* Permite realizar una accion en un bucle    *");
        System.out.println("* hasta que se cumpla una condicion definida *");
        System.out.println("* booleana de control.                       *");
        System.out.println("*                                            *");
        System.out.println("**********************************************");
    }
}


